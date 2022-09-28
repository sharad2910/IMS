package com.project.InventorymanagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.InventorymanagementSystem.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
