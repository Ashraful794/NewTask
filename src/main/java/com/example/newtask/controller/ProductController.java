package com.example.newtask.controller;

import com.example.newtask.model.Product;
import com.example.newtask.service.ProductSurvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductSurvice productSurvice;

    @PostMapping("/product")
    public ResponseEntity addProduct(@RequestBody Product product)
    {
     return ResponseEntity.ok(this.productSurvice.addProduct(product));
    }

    @GetMapping("/product")
    public ResponseEntity getProduct()
    {
        return ResponseEntity.ok(this.productSurvice.getProduct());
    }

}
