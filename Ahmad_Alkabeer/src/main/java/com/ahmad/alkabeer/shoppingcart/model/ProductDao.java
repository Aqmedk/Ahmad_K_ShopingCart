package com.ahmad.alkabeer.shoppingcart.model;


import org.springframework.data.jpa.repository.JpaRepository;
import com.ahmad.alkabeer.shoppingcart.model.Product;

public interface ProductDao extends JpaRepository<Product, Long> {
}
