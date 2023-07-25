package com.poly.bookshop.controller;


import com.poly.bookshop.entity.HTThanhToan;
import com.poly.bookshop.service.HTThanhToanService;
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
@RequestMapping("/admin/hinh-thuc-thanh-toan")
public class HTThanhToanController {

    @Autowired
    private HTThanhToanService thanhToanService;

    @GetMapping()
    public List<HTThanhToan> getPaymentMethods() {
        return thanhToanService.getAll();
    }

    @GetMapping("/{id}")
    public HTThanhToan getPaymentMethod(@PathVariable("id") String id) {
        return thanhToanService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public HTThanhToan addPaymentMethod(@RequestBody HTThanhToan paymentMethod) {
        return thanhToanService.save(paymentMethod);
    }

    @PutMapping("/{id}")
    public HTThanhToan updatePaymentMethod(@RequestBody HTThanhToan paymentMethod) {
        return thanhToanService.update(paymentMethod);
    }

    @DeleteMapping("/{id}")
    public void deletePaymentMethod(@PathVariable("id") String id) {
        thanhToanService.delete(Long.parseLong(id));
    }
}
