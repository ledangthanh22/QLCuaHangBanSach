package com.poly.bookshop.service;

import com.poly.bookshop.entity.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);

    Book update(Book book);

    void delete(Long id);

    Book getOne(Long id);

    List<Book> getAll();
}
