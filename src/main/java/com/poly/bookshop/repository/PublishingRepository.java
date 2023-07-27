package com.poly.bookshop.repository;

import com.poly.bookshop.entity.Publishing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishingRepository extends JpaRepository<Publishing,Long> {
}
