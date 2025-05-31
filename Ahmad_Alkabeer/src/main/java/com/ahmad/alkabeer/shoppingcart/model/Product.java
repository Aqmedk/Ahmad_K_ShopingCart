package com.ahmad.alkabeer.shoppingcart.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ahmad_alkabeer_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private double tax;
    private int stock;

    public Product() {}

    public Product(String name, String description, double price, double tax, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.tax = tax;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    // Add other getters/setters if needed
}
