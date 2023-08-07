package com.poly.bookshop.rest;


import com.poly.bookshop.entity.Shipping;
import com.poly.bookshop.service.ShippingService;
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
@RequestMapping("/admin/shipping")
public class ShippingRestController {

    @Autowired
    private ShippingService shippingService;

    @GetMapping()
    public List<Shipping> getShippingMethods() {
        return shippingService.getAll();
    }

    @GetMapping("/{id}")
    public Shipping getShippingMethod(@PathVariable("id") String id) {
        return shippingService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Shipping addShippingMethod(@RequestBody Shipping shippingMethod) {
        return shippingService.save(shippingMethod);
    }

    @PutMapping("/{id}")
    public Shipping updateShippingMethod(@RequestBody Shipping shippingMethod) {
        return shippingService.update(shippingMethod);
    }

    @DeleteMapping("/{id}")
    public void deleteShippingMethod(@PathVariable("id") String id) {
        shippingService.delete(Long.parseLong(id));
    }
}
