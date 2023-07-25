package com.poly.bookshop.controller;


import com.poly.bookshop.entity.LoaiSach;
import com.poly.bookshop.service.LoaiSachService;
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
@RequestMapping("/admin/loai-sach")
public class LoaiSachController {

    @Autowired
    private LoaiSachService loaiSachService;

    @GetMapping()
    public List<LoaiSach> getBookCategories() {
        return loaiSachService.getAll();
    }

    @GetMapping("/{id}")
    public LoaiSach getBookCategory(@PathVariable("id") String id) {
        return loaiSachService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public LoaiSach addBookCategory(@RequestBody LoaiSach bookCategory) {
        return loaiSachService.save(bookCategory);
    }

    @PutMapping("/{id}")
    public LoaiSach updateBookCategory(@RequestBody LoaiSach bookCategory) {
        return loaiSachService.update(bookCategory);
    }

    @DeleteMapping("/{id}")
    public void deleteBookCategory(@PathVariable("id") String id) {
        loaiSachService.delete(Long.parseLong(id));
    }
}
