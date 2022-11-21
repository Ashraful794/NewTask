package com.example.newtask.controller;

import com.example.newtask.model.Customer;
import com.example.newtask.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customers")
    public ResponseEntity createCustomer(@RequestBody Customer customer)
    {
        return ResponseEntity.ok(customerService.createCustomers(customer));
    }

    @GetMapping("/customers")
    public ResponseEntity getCustomers()
    {
        return ResponseEntity.ok(customerService.getCustomers());
    }



}
