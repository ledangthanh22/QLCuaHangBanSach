package com.poly.bookshop.service;

import com.poly.bookshop.entity.Staff;

import java.util.List;

public interface StaffService {

    Staff save(Staff staff);

    Staff update(Staff staff);

    void delete(Long id);

    Staff getOne(Long id);

    List<Staff> getAll();
}
