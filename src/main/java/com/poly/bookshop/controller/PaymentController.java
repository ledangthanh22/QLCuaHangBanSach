package com.poly.bookshop.controller;


import com.poly.bookshop.entity.Payment;
import com.poly.bookshop.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping()
    public List<Payment> getPaymentMethods() {
        return paymentService.getAll();
    }

    @GetMapping("/{id}")
    public Payment getPaymentMethod(@PathVariable("id") String id) {
        return paymentService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Payment addPaymentMethod(@RequestBody Payment paymentMethod) {
        return paymentService.save(paymentMethod);
    }

    @PutMapping("/{id}")
    public Payment updatePaymentMethod(@RequestBody Payment paymentMethod) {
        return paymentService.update(paymentMethod);
    }

    @DeleteMapping("/{id}")
    public void deletePaymentMethod(@PathVariable("id") String id) {
        paymentService.delete(Long.parseLong(id));
    }
}
