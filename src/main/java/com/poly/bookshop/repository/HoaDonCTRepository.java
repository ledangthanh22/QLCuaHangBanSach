package com.poly.bookshop.repository;

import com.poly.bookshop.entity.HoaDonCT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoaDonCTRepository extends JpaRepository<HoaDonCT,Long> {
}
