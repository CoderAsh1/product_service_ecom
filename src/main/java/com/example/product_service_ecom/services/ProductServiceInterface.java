package com.example.product_service_ecom.services;

import com.example.product_service_ecom.models.Product;

import java.util.List;

public interface ProductServiceInterface {
    Product createProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
