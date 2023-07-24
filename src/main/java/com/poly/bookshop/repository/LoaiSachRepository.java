package com.poly.bookshop.repository;

import com.poly.bookshop.entity.LoaiSach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiSachRepository extends JpaRepository<LoaiSach,Long> {
}
