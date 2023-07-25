package com.poly.bookshop.repository;

import com.poly.bookshop.entity.TacGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacGiaRepository extends JpaRepository<TacGia,Long> {
}
