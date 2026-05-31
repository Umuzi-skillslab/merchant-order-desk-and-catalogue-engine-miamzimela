package com.paynestsystem.domain;

public class OrderItem {
    private final Product product;
    private final int quantity;

    //Constructor
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    //Getter for product
    public Product getProduct() {
        return product;
    }

    //Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    //Subtotal calculation for this item
    public double calculateTotal() {
        return product.getPrice() * quantity;
    }
}