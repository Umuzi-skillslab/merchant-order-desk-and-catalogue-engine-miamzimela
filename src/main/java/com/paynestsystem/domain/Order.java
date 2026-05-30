package com.paynestsystem.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<OrderItem> items;

    //Constructor
    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.items = new ArrayList<>();
}

//The ID getter that OrderService is looking for
public int getID() {
    return id;
}

//The Customer getter so OrderService can find the name and email
public Customer getCustomer() {
    return customer;
}

//The items getter so OrderService can loop through the products
public List<OrderItem> getItems() {
    return items;
}

//The method to add items to the list
public void addItem(Product product, int quantity) {
    this.items.add(new OrderItem(product, quantity));
}

//The calculation method to total price of the bill
public double calculateTotal() {
    double total = 0;
    for (OrderItem item : items) {
        total += item.calculateTotal();
    }
    return total;
    }
}