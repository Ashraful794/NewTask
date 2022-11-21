package com.example.newtask.service;

import com.example.newtask.model.Orders;
import com.example.newtask.model.OrdersProduct;
import com.example.newtask.model.ShoppingCart;

import java.util.List;

public interface OrderService {

    Orders createOrders(List<ShoppingCart> shoppingCarts,Integer customerId);

    List<OrdersProduct> getOrderProduct(Integer customerId);
}
