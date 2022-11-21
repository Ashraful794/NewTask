package com.example.newtask.controller;

import com.example.newtask.model.Address;
import com.example.newtask.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/address/userid/{id}")
    public ResponseEntity createAddress(@RequestBody Address address, @PathVariable Integer id)
    {
        return ResponseEntity.ok(this.addressService.createAddress(address,id));
    }
}
