package com.poly.bookshop.service;

import com.poly.bookshop.entity.Category;

import java.util.List;

public interface CategoryService {

    Category save(Category category);

    Category update(Category category);

    void delete(Long id);

    Category getOne(Long id);

    List<Category> getAll();
}
