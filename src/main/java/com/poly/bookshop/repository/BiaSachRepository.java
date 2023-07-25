package com.poly.bookshop.repository;

import com.poly.bookshop.entity.BiaSach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiaSachRepository extends JpaRepository<BiaSach,Long> {
}
