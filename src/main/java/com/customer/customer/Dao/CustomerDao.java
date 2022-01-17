package com.customer.customer.Dao;

import com.customer.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao  extends JpaRepository<Customer,Long> {
}
