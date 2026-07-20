package com.paynestsystem.app;

import com.paynestsystem.domain.*;
import com.paynestsystem.service.OrderService;

public class PayNestApplication {
    public static void main(String[] args) {
        // Create sample products
        Product womack = new Product(101, "The Poet - Bobby Womack", 849.99);
        Product queen = new Product(102, "Hot Space - Queen", 999.90);

        //2. Create sample customer
        Customer customer = new Customer(1, "Mia Mzimela", "mia.mzimela@umuzi.org");

        //3. Create order
        Order order = new Order(5001, customer);

        //4. Add items to invoice
        order.addItem(womack, 1);
        order.addItem(queen, 1);

        //5.Execute and print the invoice summary
        OrderService orderService = new OrderService();
        orderService.printSummary(order);
    }
}
