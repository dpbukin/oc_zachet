package com.example.zachet_admin_oc.controller;

import org.springframework.web.bind.annotation.*;
import com.example.zachet_admin_oc.model.Product;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/get_all_products")
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1, "Apple");
        Product product2 = new Product(2, "Car");
        products.add(product1);
        products.add(product2);
        return products;
    }

}
