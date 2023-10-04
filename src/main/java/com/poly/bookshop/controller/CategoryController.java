package com.poly.bookshop.controller;


import com.poly.bookshop.entity.Category;
import com.poly.bookshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public List<Category> getBookCategories() {
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public Category getBookCategory(@PathVariable("id") String id) {
        return categoryService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Category addBookCategory(@RequestBody Category bookCategory) {
        return categoryService.save(bookCategory);
    }

    @PutMapping("/{id}")
    public Category updateBookCategory(@RequestBody Category bookCategory) {
        return categoryService.update(bookCategory);
    }

    @DeleteMapping("/{id}")
    public void deleteBookCategory(@PathVariable("id") String id) {
        categoryService.delete(Long.parseLong(id));
    }
}
