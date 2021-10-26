package com.tokopedei.controller;

import com.tokopedei.exception.ResourceNotFoundException;
import com.tokopedei.model.Customer;
import com.tokopedei.model.Product;
import com.tokopedei.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/data/api/")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    //get all
    @GetMapping("/Customer")
    public List<Customer> getAllProduct(){
        return customerRepository.findAll();
    }

    @GetMapping("/Customer/{id}")
    public ResponseEntity<Customer> getProductById(@PathVariable long id){
        Customer customer = customerRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Customer not exits with id :" + id));
        return ResponseEntity.ok(customer);
    }
}
