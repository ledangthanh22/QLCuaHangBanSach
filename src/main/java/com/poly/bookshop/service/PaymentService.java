package com.poly.bookshop.service;

import com.poly.bookshop.entity.Payment;

import java.util.List;

public interface PaymentService {

    Payment save(Payment payment);

    Payment update(Payment payment);

    void delete(Long id);

    Payment getOne(Long id);

    List<Payment> getAll();
}
