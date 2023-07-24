package com.poly.bookshop.repository;

import com.poly.bookshop.entity.PTVanChuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PTVanChuyenRepository extends JpaRepository<PTVanChuyen,Long> {
}
