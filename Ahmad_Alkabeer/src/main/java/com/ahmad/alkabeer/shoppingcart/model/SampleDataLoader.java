package com.ahmad.alkabeer.shoppingcart.model;

import com.ahmad.alkabeer.shoppingcart.model.Product;
import com.ahmad.alkabeer.shoppingcart.model.ShoppingCart;
import com.ahmad.alkabeer.shoppingcart.model.ProductDao;
import com.ahmad.alkabeer.shoppingcart.model.ShoppingCartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleDataLoader implements CommandLineRunner {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ShoppingCartDao cartDao;

    @Override
    public void run(String... args) throws Exception {
        if (productDao.findAll().isEmpty()) {
            productDao.save(new Product("Shirt", "Cotton shirt", 19.99, 2.00, 10));
            productDao.save(new Product("Pants", "Jeans pants", 39.99, 3.00, 5));
        }

        if (cartDao.findAll().isEmpty()) {
            ShoppingCart cart = new ShoppingCart();
            cartDao.save(cart);
        }
    }
}
