package com.poly.bookshop.service;

import com.poly.bookshop.entity.Publishing;

import java.util.List;

public interface PublishingService {

    Publishing save(Publishing publishing);

    Publishing update(Publishing publishing);

    void delete(Long id);

    Publishing getOne(Long id);

    List<Publishing> getAll();
}
