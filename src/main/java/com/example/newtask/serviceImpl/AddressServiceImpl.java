package com.example.newtask.serviceImpl;

import com.example.newtask.model.Address;
import com.example.newtask.model.Customer;
import com.example.newtask.repository.AddressRepo;
import com.example.newtask.repository.CustomerRepo;
import com.example.newtask.service.AddressService;
import com.example.newtask.service.CustomerService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepo addressRepo;

    @Autowired
    CustomerRepo customerRepo;
    @Override
    public Address createAddress(Address address,Integer userId) {

        Optional<Customer> customer=this.customerRepo.findById(userId);

        if(customer==null)
        {
            throw new  RuntimeException("Customer Id Not Found");
        }


        address.setCustomer(customer.orElseThrow());

        return this.addressRepo.save(address);
    }
}
