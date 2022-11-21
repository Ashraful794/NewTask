package com.example.newtask.controller;

import com.example.newtask.model.ShoppingCart;
import com.example.newtask.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/orders/userId/{userId}")
    public ResponseEntity createOrders(@RequestBody List<ShoppingCart> shoppingCarts, @PathVariable Integer userId)
    {
        return ResponseEntity.ok(this.orderService.createOrders(shoppingCarts,userId));
    }


}
