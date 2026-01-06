package com.erickcode.apirest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/** This decorator implies we are going to use SpringBoot annotation */
@Entity
public class Product {
    /** These decorators imply we are going to use SpringBoot annotation */
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    /** Declaring variables to use */
    private Long id;
    private String name;
    private Double price;
    /** Generation of Getters and Setters for the 3 varibles declared above */
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }    
}
