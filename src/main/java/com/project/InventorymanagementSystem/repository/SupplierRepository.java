package com.project.InventorymanagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.InventorymanagementSystem.entity.Supplier;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Long>{

}
