package com.poly.bookshop.controller;

import com.poly.bookshop.entity.Author;
import com.poly.bookshop.service.AuthorService;
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
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping()
    public List<Author> getAuthors() {
        return authorService.getAll();
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable("id") String id) {
        return authorService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Author addAuthor(@RequestBody Author author) {
        return authorService.save(author);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@RequestBody Author author) {
        return authorService.update(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable("id") String id) {
        authorService.delete(Long.parseLong(id));
    }
}
