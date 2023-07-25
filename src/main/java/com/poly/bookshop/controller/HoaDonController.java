package com.poly.bookshop.controller;


import com.poly.bookshop.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin/hoa-don")
public class HoaDonController {

    @Autowired
    private HoaDonService hoaDonService;
}
