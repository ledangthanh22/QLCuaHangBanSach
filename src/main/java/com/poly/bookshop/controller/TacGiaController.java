package com.poly.bookshop.controller;



import com.poly.bookshop.entity.TacGia;
import com.poly.bookshop.service.TacGiaService;
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
@RequestMapping("/admin/tac-gia")
public class TacGiaController {

    @Autowired
    private TacGiaService tacGiaService;

    @GetMapping()
    public List<TacGia> getAuthors() {
        return tacGiaService.getAll();
    }

    @GetMapping("/{id}")
    public TacGia getAuthor(@PathVariable("id") String id) {
        return tacGiaService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public TacGia addAuthor(@RequestBody TacGia author) {
        return tacGiaService.save(author);
    }

    @PutMapping("/{id}")
    public TacGia updateAuthor(@RequestBody TacGia author) {
        return tacGiaService.update(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable("id") String id) {
        tacGiaService.delete(Long.parseLong(id));
    }
}
