package com.example.newtask.controller;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.util.*;

@RestController
@RequestMapping("/api")
public class InvoiceController {


//    public ResponseEntity<byte[]> downloadInvoice(){
//
//        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(Arrays.asList(
//
////                new Product(121, "Keyboard", 54884), new Product(122, "Mouse", 54884),
////                new Product(123, "Laptop", 54884), new Product(124, "Mobile", 54884),
////                new Product(125, "Headphone", 54884)
//
//        ), false);
//
//        Map<String, Object> parameters = new HashMap<>();
//        parameters.put("total", "7000");
//
//        JasperReport compileReport = JasperCompileManager
//                .compileReport(new FileInputStream("src/main/resources/invoice.jrxml"));
//
//        JasperPrint jasperPrint = JasperFillManager.fillReport(compileReport, parameters, beanCollectionDataSource);
//
//         JasperExportManager.exportReportToPdfFile(jasperPrint,
//         System.currentTimeMillis() + ".pdf");
//
//        byte data[] = JasperExportManager.exportReportToPdf(jasperPrint);
//
////        System.err.println(data);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");
//
//        return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
//    }


}
