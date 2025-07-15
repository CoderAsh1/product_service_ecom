package com.example.product_service_ecom.services;

import com.example.product_service_ecom.models.Category;
import com.example.product_service_ecom.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements CategoryServiceInterface{
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        return categoryRepository.findById(id).map(existing -> {
            existing.setName(category.getName());
            existing.setDescription(category.getDescription());
            return categoryRepository.save(existing);
        }).orElse(null);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
