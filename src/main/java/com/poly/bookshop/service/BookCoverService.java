package com.poly.bookshop.service;

import com.poly.bookshop.entity.BookCover;

import java.util.List;

public interface BookCoverService {

    BookCover save(BookCover bookCover);

    BookCover update(BookCover bookCover);

    void delete(Long id);

    BookCover getOne(Long id);

    List<BookCover> getAll();
}
