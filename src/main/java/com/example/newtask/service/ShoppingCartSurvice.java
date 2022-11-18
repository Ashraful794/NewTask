package com.example.newtask.service;

import com.example.newtask.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartSurvice {

    ShoppingCart addToCart(ShoppingCart shoppingCart,Integer customerId,Integer productId);
    List<ShoppingCart> getAllcartItem();

    String deleteCart(Integer customerId,Integer productId);
}
