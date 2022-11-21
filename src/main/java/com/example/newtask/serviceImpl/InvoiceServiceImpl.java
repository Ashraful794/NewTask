package com.example.newtask.serviceImpl;

import com.example.newtask.model.Invoice;
import com.example.newtask.repository.InvoiceRepo;
import com.example.newtask.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    InvoiceRepo invoiceRepo;

    @Override
    public List<Invoice> getInvoices() {
        return this.invoiceRepo.findAll();
    }
}
