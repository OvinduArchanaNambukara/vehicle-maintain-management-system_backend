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
    public Customer createCustomer(@RequestBody Customer customerDetails) {
        Customer customer = customerRepository.save(customerDetails);
        return customer;
    }

    @PutMapping(path = "/{id}/update")
    public Customer updateCustomer(@PathVariable String id, @RequestBody Customer customerDetails) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        customer.setFirstName(customerDetails.getFirstName());
        customer.setLastName(customerDetails.getLastName());
        customer.setAddress(customerDetails.getAddress());
        customer.setCity(customerDetails.getCity());
        customer.setEmail(customerDetails.getEmail());
        customer.setNationalId(customerDetails.getNationalId());
        customer.setProvince(customerDetails.getProvince());
        customer.setZip(customerDetails.getZip());
        customer.setTelephone(customerDetails.getTelephone());

        Customer updatedCustomer = customerRepository.save(customer);
        return updatedCustomer;
    }

}
