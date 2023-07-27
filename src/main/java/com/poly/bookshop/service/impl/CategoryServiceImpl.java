package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Category;
import com.poly.bookshop.repository.CategoryRepository;
import com.poly.bookshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category getOne(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
