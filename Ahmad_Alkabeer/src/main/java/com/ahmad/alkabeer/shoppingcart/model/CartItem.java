
package com.ahmad.alkabeer.shoppingcart.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ahmad_alkabeer_cart_item")
public class CartItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;
    private int quantity;

    public double getTotalWithTax() {
        return quantity * (product.getPrice() + product.getTax());
    }

    // Getters and setters omitted for brevity
}
