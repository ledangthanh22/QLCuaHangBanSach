package com.poly.bookshop.repository;

import com.poly.bookshop.entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SachRepository extends JpaRepository<Sach,Long> {
}
