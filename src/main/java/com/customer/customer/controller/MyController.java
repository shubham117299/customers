package com.customer.customer.controller;

import com.customer.customer.entities.Customer;
import com.customer.customer.entities.Customer;
import com.customer.customer.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CustomerServices customerServices;

    @GetMapping("/home")
    public String home(){

        return "Home Page";
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){

        return this.customerServices.getCustomer();
    }
}
