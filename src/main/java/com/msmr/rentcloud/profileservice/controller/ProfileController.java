package com.msmr.rentcloud.profileservice.controller;

import com.msmr.rentcloud.commons.model.Customer;
import com.msmr.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/services")
public class ProfileController {

    @Autowired
    private CustomerService customerService;

    public Customer save(@RequestBody Customer customer){


        return customerService.save(customer);
    }
}
