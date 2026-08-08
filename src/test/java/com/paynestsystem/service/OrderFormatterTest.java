package com.paynestsystem.service;

import com.paynestsystem.domain.Customer;
import com.paynestsystem.domain.Order;
import com.paynestsystem.domain.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderFormatterTest {

    private OrderFormatter formatter;
    private Customer customer;
    private Product womack;
    private Product queen;

    @BeforeEach
    void setUp() {
        formatter = new OrderFormatter();
        customer  = new Customer(1, "Mia Mzimela", "mia@umuzi.org");
        womack    = new Product(101, "The Poet - Bobby Womack", "849.99");
        queen     = new Product(102, "Hot Space - Queen",       "999.90");
    }

    @Test
    @DisplayName("Receipt contains the customer's name")
    void receiptContainsCustomerName() {
        Order order = new Order(5001, customer);
        order.addItem(womack, 1);
        assertTrue(formatter.format(order).contains("Mia Mzimela"));
    }

    @Test
    @DisplayName("Receipt contains the customer's email")
    void receiptContainsCustomerEmail() {
        Order order = new Order(5001, customer);
        order.addItem(womack, 1);
        assertTrue(formatter.format(order).contains("mia@umuzi.org"));
    }

    @Test
    @DisplayName("Receipt contains the record name")
    void receiptContainsProductName() {
        Order order = new Order(5001, customer);
        order.addItem(womack, 1);
        assertTrue(formatter.format(order).contains("The Poet - Bobby Womack"));
    }

    @Test
    @DisplayName("Receipt shows correct total for a single record")
    void receiptShowsCorrectTotalSingleItem() {
        Order order = new Order(5001, customer);
        order.addItem(womack, 1); // R849.99
        assertTrue(formatter.format(order).contains("849.99"));
    }

    @Test
    @DisplayName("Receipt shows correct grand total for multiple records")
    void receiptShowsCorrectTotalMultipleItems() {
        Order order = new Order(5001, customer);
        order.addItem(womack, 1); // R849.99
        order.addItem(queen,  2); // 2 x R999.90 = R1,999.80
        // Grand total: R2,849.79
        assertTrue(formatter.format(order).contains("2,849.79"));
    }

    @Test
    @DisplayName("Empty order formats without crashing and shows R0.00")
    void emptyOrderFormatsWithoutCrashing() {
        Order order = new Order(9999, customer);
        String receipt = formatter.format(order);
        assertNotNull(receipt);
        assertTrue(receipt.contains("0.00"));
    }

    @Test
    @DisplayName("Null order throws IllegalArgumentException")
    void nullOrderThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> formatter.format(null));
    }
}