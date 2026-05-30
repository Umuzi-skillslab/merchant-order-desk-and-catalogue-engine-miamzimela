package com.paynestsystem.app;

import com.paynestsystem.domain.*;
import com.paynestsystem.service.OrderService;

public class PayNestApplication {
    public static void main(String[] args) {
        // Create sample products
        Product hammer = new Product(101, "Claw Hammer 500g", 249.99);
        Product nails = new Product(102, "Box of Nails 100pcs", 85.50);

        //2. Create sample customer
        Customer customer = new Customer(1, "Mia", "mia@example.co.za");

        //3. Create order
        Order order = new Order(5001, customer);

        //4. Add items to invoice
        order.addItem(hammer, 1);
        order.addItem(nails, 3);

        //5.Execute and print the invoice summary
        OrderService orderService = new OrderService();
        orderService.printSummary(order);
    }
}
