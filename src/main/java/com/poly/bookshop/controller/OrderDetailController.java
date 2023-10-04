package com.poly.bookshop.controller;
import com.poly.bookshop.entity.OrderDetail;
import com.poly.bookshop.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/order-detail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @GetMapping()
    public ResponseEntity<List<OrderDetail>> getOrderDetails(){
        return new ResponseEntity<>(orderDetailService.getAll(), HttpStatus.OK);
    }
}
