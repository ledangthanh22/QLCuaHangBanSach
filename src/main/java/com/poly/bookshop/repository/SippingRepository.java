package com.poly.bookshop.repository;

import com.poly.bookshop.entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SippingRepository extends JpaRepository<Shipping,Long> {
}
