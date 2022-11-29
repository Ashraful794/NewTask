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

    @OneToOne(mappedBy = "customer")
    private Address address;

    @OneToMany(mappedBy = "customer")
    private List<ShoppingCart> shoppingCart;


}
