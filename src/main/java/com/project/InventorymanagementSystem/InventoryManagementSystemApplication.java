package com.project.InventorymanagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.InventorymanagementSystem.repository.ItemRepository;

@SpringBootApplication
public class InventoryManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemApplication.class, args);
	}

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
		
	}

}
