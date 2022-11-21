package com.example.newtask.repository;

import com.example.newtask.model.OrdersProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderProductRepo extends JpaRepository<OrdersProduct,Integer> {

    List<OrdersProduct> findByOrderId(Integer orderId);
}
