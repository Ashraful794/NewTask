package com.example.newtask.controller;

import com.example.newtask.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;
    @GetMapping("/invoices")
    public ResponseEntity getInvoices()
    {
        return ResponseEntity.ok(this.invoiceService.getInvoices());
    }
}
