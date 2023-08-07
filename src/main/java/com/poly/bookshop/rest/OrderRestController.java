package com.poly.bookshop.rest;


import com.poly.bookshop.entity.Order;
import com.poly.bookshop.service.OrderService;
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
@RequestMapping("/admin/order")
public class OrderRestController {

    @Autowired
    private OrderService orderService;


    @GetMapping()
    public ResponseEntity<List<Order>> getOrders(){
        return new ResponseEntity<>(orderService.getAll(), HttpStatus.OK);
    }
}
