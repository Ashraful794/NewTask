package com.example.newtask.service;

import com.example.newtask.model.Product;

import java.util.List;

public interface ProductSurvice {

    Product addProduct(Product product);

    List<Product> getProduct();
}
