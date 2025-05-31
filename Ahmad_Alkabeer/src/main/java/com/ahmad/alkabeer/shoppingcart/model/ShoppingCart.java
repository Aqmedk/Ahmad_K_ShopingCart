package com.ahmad.alkabeer.shoppingcart.model;

import jakarta.persistence.*;
import java.util.*;



@Entity
@Table(name = "ahmad_alkabeer_cart")
public class ShoppingCart {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> items = new ArrayList<>();

    public double getTotal() {
        return items.stream().mapToDouble(CartItem::getTotalWithTax).sum();
    }

    // Getters and setters omitted for brevity
}



