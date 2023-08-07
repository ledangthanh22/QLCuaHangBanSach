package com.poly.bookshop.rest;


import com.poly.bookshop.entity.Shipper;
import com.poly.bookshop.service.ShipperService;
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
@RequestMapping("/admin/shipper")
public class ShipperRestController {

    @Autowired
    private ShipperService shipperService;

    @GetMapping()
    public List<Shipper> getShippers() {
        return shipperService.getAll();
    }

    @GetMapping("/{id}")
    public Shipper getShipper(@PathVariable("id") String id) {
        return shipperService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Shipper addShipper(@RequestBody Shipper shipper) {
        return shipperService.save(shipper);
    }

    @PutMapping("/{id}")
    public Shipper updateShipper(@RequestBody Shipper shipper) {
        return shipperService.update(shipper);
    }

    @DeleteMapping("/{id}")
    public void deleteShipper(@PathVariable("id") String id) {
        shipperService.delete(Long.parseLong(id));
    }
}
