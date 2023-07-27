package com.poly.bookshop.controller;

import com.poly.bookshop.entity.Position;
import com.poly.bookshop.service.PositionService;
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
@RequestMapping("/admin/position")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping()
    public List<Position> getPositions() {
        return positionService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deletePosition(@PathVariable("id") String id) {
        positionService.delete(Long.parseLong(id));
    }

    @GetMapping("/{id}")
    public Position getPosition(@PathVariable("id") String id) {
        return positionService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Position addPosition(@RequestBody Position position) {
        return positionService.save(position);
    }

    @PutMapping("/{id}")
    public Position updatePosition(@PathVariable("id") String id, @RequestBody Position position) {
        return positionService.update(position);
    }
}
