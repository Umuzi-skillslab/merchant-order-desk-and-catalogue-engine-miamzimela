package com.paynestsystem.service;

import com.paynestsystem.domain.Order;

/**
 * Orchestrates order-related operations such as printing receipts.
 *
 * OrderService asks OrderFormatter to build the text, then prints it.
 * If we later want to email the receipt, we change only this class.
 */
public class OrderService {

    private final OrderFormatter formatter;

    public OrderService() {
        this.formatter = new OrderFormatter();
    }

    /**
     * Prints the order receipt to the console.
     * @param order The order to print. Must not be null.
     */
    public void printSummary(Order order) {
        if (order == null) {
            System.out.println("No order details available.");
            return;
        }
        System.out.print(formatter.format(order));
    }
}