package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Book;
import com.poly.bookshop.repository.BookRepository;
import com.poly.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book getOne(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
