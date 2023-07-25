package com.poly.bookshop.controller;


import com.poly.bookshop.entity.LoaiSach;
import com.poly.bookshop.entity.Sach;
import com.poly.bookshop.service.LoaiSachService;
import com.poly.bookshop.service.SachService;
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
@RequestMapping("/admin/sach")
public class SachController {

    @Autowired
    private SachService sachService;

    @GetMapping()
    public List<Sach> getBooks() {
        return sachService.getAll();
    }

    @GetMapping("/{id}")
    public Sach getBook(@PathVariable("id") String id) {
        return sachService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Sach addBook(@RequestBody Sach book) {
        return sachService.save(book);
    }

    @PutMapping("/{id}")
    public Sach updateBook(@RequestBody Sach book) {
        return sachService.update(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") String id) {
        sachService.delete(Long.parseLong(id));
    }
}
