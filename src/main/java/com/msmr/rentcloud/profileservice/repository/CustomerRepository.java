package com.msmr.rentcloud.profileservice.repository;

import com.msmr.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
