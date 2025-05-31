package com.ahmad.alkabeer.shoppingcart.model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartDao cartDao;

    @GetMapping
    public List<ShoppingCart> getAllCarts() {
        return cartDao.findAll();
    }
}
