package com.ahmad.alkabeer.shoppingcart.model;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ahmad.alkabeer.shoppingcart.model.ShoppingCart;

public interface ShoppingCartDao extends JpaRepository<ShoppingCart, Long> {
}
