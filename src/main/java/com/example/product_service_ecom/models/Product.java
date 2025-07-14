package com.example.product_service_ecom.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "product")
public class Product extends BaseClass{
    private String name;
    private String description;
    private String image;
    private double price;
    private int stock;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    private Category category;
}
