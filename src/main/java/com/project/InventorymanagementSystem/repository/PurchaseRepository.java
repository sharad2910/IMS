package com.project.InventorymanagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.InventorymanagementSystem.entity.PurchaseItem;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseItem, Long> {

}
