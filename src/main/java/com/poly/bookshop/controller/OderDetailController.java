package com.poly.bookshop.controller;

import com.poly.bookshop.service.OderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin/oder-detail")
public class OderDetailController {

    @Autowired
    private OderDetailService oderDetailService;
}
