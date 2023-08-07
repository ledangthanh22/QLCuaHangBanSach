package com.poly.bookshop.rest;

import com.poly.bookshop.entity.Position;
import com.poly.bookshop.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class PositionRestController {

    @Autowired
    private PositionService positionService;

    @GetMapping()
    public ResponseEntity<List<Position>> getPositions() {
        List<Position> positionList = positionService.getAll();
        return new ResponseEntity<>(positionList, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Position> getPosition(@PathVariable("id") String id) {
        Position position = positionService.getOne(Long.parseLong(id));
        return new ResponseEntity<>(position, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Position> createPosition(@RequestBody Position position) {
        return new ResponseEntity<>(positionService.save(position), HttpStatus.OK);
    }

    @PutMapping("/id")
    public ResponseEntity<Position> updatePosition(@PathVariable("id") String id, @RequestBody Position position) {
        return new ResponseEntity<>(positionService.save(position), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePosition(@PathVariable("id") String id) {
        positionService.delete(Long.parseLong(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
