package com.example.newtask.controller;

import com.example.newtask.model.ShoppingCart;
import com.example.newtask.service.ShoppingCartSurvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping("/api")
public class ShoppingCartController {
    @Autowired
    ShoppingCartSurvice shoppingCartSurvice;

    @PostMapping("/addToCart/customerId/{customerId}/productId/{productId}")
    public ResponseEntity addToCart(@RequestBody ShoppingCart shoppingCart, @PathVariable Integer customerId, @PathVariable Integer productId)
    {
        return ResponseEntity.ok(shoppingCartSurvice.addToCart(shoppingCart,customerId,productId));
    }

    @GetMapping("/getCart")
    public ResponseEntity getCart()
    {
        return ResponseEntity.ok(this.shoppingCartSurvice.getAllcartItem());
    }

}
