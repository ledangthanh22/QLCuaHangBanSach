package com.poly.bookshop.repository;

import com.poly.bookshop.entity.BookCover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCoverRepository extends JpaRepository<BookCover,Long> {
}
