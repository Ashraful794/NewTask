package com.example.newtask.repository;

import com.example.newtask.model.Address;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {

    Address findByCustomerId(Integer customerId);
}
