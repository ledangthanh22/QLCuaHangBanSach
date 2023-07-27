package com.poly.bookshop.service;

import com.poly.bookshop.entity.Author;

import java.util.List;

public interface AuthorService {

    Author save(Author author);

    Author update(Author author);

    void delete(Long id);

    Author getOne(Long id);

    List<Author> getAll();
}
