package com.paynestsystem.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int id;
    private final Customer customer;
    private final List<OrderItem> items;

    //Constructor
    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.items = new ArrayList<>();
}

public void addItem(Product product, int quantity) {
    if (product == null || quantity <= 0) {
        throw new IllegalArgumentException("Product cannot be null and quantity must be greater than zero.");
    }
    if (quantity <= 0) {
        throw new IllegalArgumentException("Quantity must be greater than zero.");
    }
    items.add(new OrderItem(product, quantity));
}
public double calculateTotal() {
    double total = 0.0;
    for (OrderItem item : items) {
        total += item.calculateTotal();
    }
    return total;
}

public List<OrderItem> getItems() {
    return items;
}

public int getId() {
    return id;
}

public Customer getCustomer() {
    return customer;
}
}