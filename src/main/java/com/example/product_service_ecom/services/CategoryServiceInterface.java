package com.example.product_service_ecom.services;

import com.example.product_service_ecom.models.Category;

import java.util.List;

public interface CategoryServiceInterface {
    Category createCategory(Category category);
    Category getCategoryById(Long id);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
    List<Category> getAllCategories();
}
