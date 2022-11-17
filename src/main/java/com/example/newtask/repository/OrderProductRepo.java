package com.example.newtask.repository;

import com.example.newtask.model.OrdersProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepo extends JpaRepository<OrdersProduct,Integer> {
}
