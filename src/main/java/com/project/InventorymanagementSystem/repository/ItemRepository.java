package com.project.InventorymanagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.InventorymanagementSystem.entity.Item;

public interface ItemRepository extends JpaRepository< Item , Long >{


}
