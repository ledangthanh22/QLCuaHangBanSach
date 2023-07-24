package com.poly.bookshop.repository;

import com.poly.bookshop.entity.HTThanhToan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HTThanhToanRepository extends JpaRepository<HTThanhToan,Long> {
}
