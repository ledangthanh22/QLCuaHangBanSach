package com.poly.bookshop.repository;

import com.poly.bookshop.entity.OderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OderDetailRepository extends JpaRepository<OderDetail,Long> {
}
