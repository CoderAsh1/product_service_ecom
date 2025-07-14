package com.example.product_service_ecom.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @CreationTimestamp
    @Column(name = "updated_date")
    private Date updatedDate;

}
