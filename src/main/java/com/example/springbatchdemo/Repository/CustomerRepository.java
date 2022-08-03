package com.example.springbatchdemo.Repository;

import com.example.springbatchdemo.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {


}
