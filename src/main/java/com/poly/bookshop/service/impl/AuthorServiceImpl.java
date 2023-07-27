package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Author;
import com.poly.bookshop.repository.AuthorRepository;
import com.poly.bookshop.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author update(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void delete(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public Author getOne(Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }
}
