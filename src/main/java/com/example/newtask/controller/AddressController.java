package com.example.newtask.controller;

import com.example.newtask.model.Address;
import com.example.newtask.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/addaddress/userid/{id}")
    public ResponseEntity addAddress(@RequestBody Address address, @PathVariable Integer id)
    {
        return ResponseEntity.ok(this.addressService.addAddress(address,id));
    }
}
