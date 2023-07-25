package com.poly.bookshop.service;

import com.poly.bookshop.entity.BiaSach;

import java.util.List;

public interface BiaSachService {

    BiaSach save(BiaSach loaiBia);

    BiaSach update(BiaSach loaiBia);

    void delete(Long id);

    BiaSach getOne(Long id);

    List<BiaSach> getAll();
}
