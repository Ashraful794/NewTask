package com.example.newtask.repository;

import com.example.newtask.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepo extends JpaRepository<Invoice ,Integer> {

    Invoice findByCustomerId(Integer customerId);

}
