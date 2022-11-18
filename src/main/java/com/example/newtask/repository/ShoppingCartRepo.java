package com.example.newtask.repository;

import com.example.newtask.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShoppingCartRepo extends JpaRepository<ShoppingCart,Integer> {


    ShoppingCart findByCustomerIdAndProductId(Integer customerId,Integer productId);


}
