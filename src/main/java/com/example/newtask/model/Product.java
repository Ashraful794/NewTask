package com.example.newtask.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int availableQuantity;
    private float price;

//    @OneToOne(mappedBy = "product")
//    @JsonIgnore
//    private ShoppingCart shoppingCart;
//
//    @OneToOne(mappedBy = "product")
//    @JsonIgnore
//    private OrdersProduct ordersProduct;
}
