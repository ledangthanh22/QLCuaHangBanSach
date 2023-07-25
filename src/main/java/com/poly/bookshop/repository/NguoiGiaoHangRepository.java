package com.poly.bookshop.repository;

import com.poly.bookshop.entity.NguoiGiaoHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiGiaoHangRepository extends JpaRepository<NguoiGiaoHang,Long> {
}
