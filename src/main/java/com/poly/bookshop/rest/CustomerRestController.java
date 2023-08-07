package com.poly.bookshop.rest;

import com.poly.bookshop.entity.Customer;
import com.poly.bookshop.service.CustomerService;
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
@RequestMapping("/admin/customer")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public List<Customer> getCustomers() {
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") String id) {
        return customerService.getOne(Long.parseLong(id));
    }

    @PostMapping()
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable("id") String id, @RequestBody Customer customer) {
        return customerService.update(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") String id) {
        customerService.delete(Long.parseLong(id));
    }
}
