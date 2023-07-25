package com.poly.bookshop.service;

import com.poly.bookshop.entity.Sach;

import java.util.List;

public interface SachService {

    Sach save(Sach sach);

    Sach update(Sach sach);

    void delete(Long id);

    Sach getOne(Long id);

    List<Sach> getAll();
}
