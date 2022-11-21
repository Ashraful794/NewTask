package com.example.newtask.serviceImpl;

import com.example.newtask.model.Customer;
import com.example.newtask.repository.CustomerRepo;
import com.example.newtask.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public Customer createCustomers(Customer customer) {

        return customerRepo.save(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        return this.customerRepo.findAll();
    }
}
