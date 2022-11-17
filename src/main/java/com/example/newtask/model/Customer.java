package com.example.newtask.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    @OneToOne(mappedBy = "customer",fetch = FetchType.LAZY)
    private Address address;

    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private List<ShoppingCart> shoppingCart;


    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;

}
