package com.poly.bookshop.service.impl;

import com.poly.bookshop.entity.Payment;
import com.poly.bookshop.repository.PaymentRepository;
import com.poly.bookshop.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void delete(Long id) {
        paymentRepository.deleteById(id);
    }

    @Override
    public Payment getOne(Long id) {
        return paymentRepository.findById(id).orElseThrow(()-> new RuntimeException("Khong tim thay id nay!"));
    }

    @Override
    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }
}
