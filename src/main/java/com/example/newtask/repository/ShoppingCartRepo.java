package com.example.newtask.repository;

import com.example.newtask.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public interface ShoppingCartRepo extends JpaRepository<ShoppingCart,Integer> {



    ShoppingCart findByCustomerIdAndProductId(Integer customerId,Integer productId);

    List<ShoppingCart> findByCustomerId(Integer customerId);

}
