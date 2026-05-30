package com.paynestsystem.service;

import com.paynestsystem.domain.*;

public class OrderService {

    public void printSummary(Order order) {
        if (order == null) {
            System.out.println("No order details available.");
            return;
        }

        System.out.println("==========================================");
        System.out.println("               PAYNEST INVOICE            ");
        System.out.println("==========================================");
        System.out.println("Order ID:   " + order.getId());
        System.out.println("Customer:   " + order.getCustomer().getName());
        System.out.println("Email:      " + order.getCustomer().getEmail());
        System.out.println("------------------------------------------");
        System.out.printf("%-20s %-10s R%,.2f%n", "Product", "Qty", "Subtotal");
        System.out.println("------------------------------------------");

        //Loop through all items and display them clearly
        for (OrderItem item : order.getItems()) {
            System.out.printf("%-20s %-10d R% .2f%n",
                    item.getProduct().getName(),
                    item.getQuantity(),
                    item.calculateTotal());
        };
    }

    System.out.println("------------------------------------------");
    System.out.printf("%-31s R%, .2f%n", "GRAND TOTAL:", "", order.calculateTotal());
    System.out.println("==========================================");
    }
}
