package com.poly.bookshop.repository;

import com.poly.bookshop.entity.Oder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OderRepository extends JpaRepository<Oder,Long> {
}
