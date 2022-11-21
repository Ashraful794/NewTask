package com.example.newtask.service;

import com.example.newtask.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartSurvice {

    ShoppingCart createCarts(ShoppingCart shoppingCart,Integer customerId,Integer productId);
    List<ShoppingCart> getCarts();

    String deleteCarts(Integer customerId,Integer productId);
}
