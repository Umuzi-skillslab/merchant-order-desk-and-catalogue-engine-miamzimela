package com.paynestsystem.domain;

public class Customer {
    private final int id;
    private final String name;
    private final String email;

    //Constructor matching application runner's arguments
    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //Method to get customer's name
    public String getName() {
        return name;
    }

    //Method to get customer's email
    public String getEmail() {
        return email;
    }

    //Method to get customer's ID
    public int getId() {
        return id;
    }
}