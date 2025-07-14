package com.example.product_service_ecom.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "category")
@Getter
@Setter
public class Category extends BaseClass{
    private String name;
    private String description;
}
