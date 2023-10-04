package com.poly.bookshop.controller;



import com.poly.bookshop.entity.Publishing;
import com.poly.bookshop.service.PublishingService;
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
@RequestMapping("/api/publishing")
public class PublishingController {

    @Autowired
    private PublishingService publishingService;

    @GetMapping()
    public List<Publishing> getPublishes() {
        return publishingService.getAll();
    }

    @GetMapping("/{id}")
    public Publishing getPublishing(@PathVariable("id") String id) {
        return publishingService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Publishing addPublishing(@RequestBody Publishing publishing) {
        return publishingService.save(publishing);
    }

    @PutMapping("/{id}")
    public Publishing updatePublishing(@RequestBody Publishing publishing) {
        return publishingService.update(publishing);
    }

    @DeleteMapping("/{id}")
    public void deletePublishing(@PathVariable("id") String id) {
        publishingService.delete(Long.parseLong(id));
    }
}
