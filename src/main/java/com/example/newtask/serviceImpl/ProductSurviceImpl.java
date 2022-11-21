package com.example.newtask.serviceImpl;

import com.example.newtask.model.Product;
import com.example.newtask.repository.ProductRepo;
import com.example.newtask.service.ProductSurvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSurviceImpl implements ProductSurvice {
    @Autowired
    ProductRepo productRepo;

    @Override
    public Product addProduct(Product product) {
        return this.productRepo.save(product);
    }

    @Override
    public List<Product> getProduct() {
        return this.productRepo.findAll();
    }
}
