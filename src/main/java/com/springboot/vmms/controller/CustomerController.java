package com.springboot.vmms.controller;

import com.springboot.vmms.model.Customer;
import com.springboot.vmms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(path = "/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(path = "/{id}")
    public Customer getCustomerById(@PathVariable String id) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        return customer;
    }

    @PostMapping(path = "create")
    public Customer createCustomer(@RequestBody Customer customerDetails){
        Customer customer=customerRepository.save(customerDetails);
        return customer;
    }

}
