package com.poly.bookshop.controller;

import com.poly.bookshop.entity.BiaSach;
import com.poly.bookshop.service.BiaSachService;
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
@RequestMapping("/admin/bia-sach")
public class BiaSachController {

    @Autowired
    private BiaSachService biaSachService;

    @GetMapping()
    public List<BiaSach> getBookCovers() {
        return biaSachService.getAll();
    }

    @GetMapping("/{id}")
    public BiaSach getBookCover(@PathVariable("id") String id) {
        return biaSachService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public BiaSach addBookCover(@RequestBody BiaSach bookCover) {
        return biaSachService.save(bookCover);
    }

    @PutMapping("/{id}")
    public BiaSach updateBookCover(@PathVariable("id") String id, @RequestBody BiaSach bookCover) {
        return biaSachService.update(bookCover);
    }

    @DeleteMapping("/{id}")
    public void deleteBookCover(@PathVariable("id") String id) {
        biaSachService.delete(Long.parseLong(id));
    }
}
