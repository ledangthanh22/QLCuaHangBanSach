package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.BookCover;
import com.poly.bookshop.repository.BookCoverRepository;
import com.poly.bookshop.service.BookCoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCoverServiceImpl implements BookCoverService {

    @Autowired
    private BookCoverRepository bookCoverRepository;

    @Override
    public BookCover save(BookCover bookCover) {
        return bookCoverRepository.save(bookCover);
    }

    @Override
    public BookCover update(BookCover bookCover) {
        return bookCoverRepository.save(bookCover);
    }

    @Override
    public void delete(Long id) {
        bookCoverRepository.deleteById(id);
    }

    @Override
    public BookCover getOne(Long id) {
        return bookCoverRepository.findById(id).orElseThrow(()-> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<BookCover> getAll() {
        return bookCoverRepository.findAll();
    }
}
