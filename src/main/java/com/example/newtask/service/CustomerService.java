package com.example.newtask.service;

import com.example.newtask.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);

    List<Customer> getCustomers();
}
