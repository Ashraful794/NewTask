package com.example.newtask.controller;

import com.example.newtask.model.ShoppingCart;
import com.example.newtask.service.ShoppingCartSurvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
public class ShoppingCartController {
    @Autowired
    ShoppingCartSurvice shoppingCartSurvice;

    @PostMapping("/carts/customerId/{customerId}/productId/{productId}")
    public ResponseEntity addToCart(@RequestBody ShoppingCart shoppingCart, @PathVariable Integer customerId, @PathVariable Integer productId)
    {
        return ResponseEntity.ok(shoppingCartSurvice.createCarts(shoppingCart,customerId,productId));
    }

    @GetMapping("/carts")
    public ResponseEntity getCart()
    {
        return ResponseEntity.ok(this.shoppingCartSurvice.getCarts());
    }

    @DeleteMapping("/carts/customerId/{customerId}/productId/{productId}")
    public ResponseEntity deleteCarts(@PathVariable Integer customerId,@PathVariable Integer productId)
    {
        return ResponseEntity.ok(this.shoppingCartSurvice.deleteCarts(customerId,productId));
    }

}
