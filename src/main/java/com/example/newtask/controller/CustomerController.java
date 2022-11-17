package com.example.newtask.controller;

import com.example.newtask.model.Customer;
import com.example.newtask.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/createCustomer")
    public ResponseEntity createCustomer(@RequestBody Customer customer)
    {
        return ResponseEntity.ok(customerService.createCustomer(customer));
    }

    @GetMapping("/getCustomers")
    public ResponseEntity getAllCustomer()
    {
        return ResponseEntity.ok(customerService.getCustomers());
    }



}
