package com.example.newtask.controller;

import com.example.newtask.model.Product;
import com.example.newtask.service.ProductSurvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductSurvice productSurvice;

    @PostMapping("/addProduct")
    public ResponseEntity addProduct(@RequestBody Product product)
    {
     return ResponseEntity.ok(this.productSurvice.addProduct(product));
    }

}
