package com.example.newtask.service;

import com.example.newtask.model.Address;

public interface AddressService {

    Address createAddress(Address address,Integer userId);
}
