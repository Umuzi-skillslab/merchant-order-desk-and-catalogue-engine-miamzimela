package com.paynestsystem.domain;

public class Product {
    private int id;
    private String name;
    private double price;

    // Constructor: Creates a product in one line
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //Getter for Name
    public String getName() {
        return name;
    }

    //Getter for Price
    public double getPrice() {
        return price;
    }

    //Getter for ID
    public int getId() {
        return id;
    }
}