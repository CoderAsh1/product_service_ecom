package com.example.product_service_ecom.services;

import com.example.product_service_ecom.models.Product;
import com.example.product_service_ecom.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductServiceInterface{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return productRepository.findById(id).map(existing -> {
         existing.setName(product.getName());
         existing.setDescription(product.getDescription());
         existing.setImage(product.getImage());
         existing.setPrice(product.getPrice());
         existing.setStock(product.getStock());
         existing.setCategory(product.getCategory());
         return productRepository.save(existing);
         }).orElse(null);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
