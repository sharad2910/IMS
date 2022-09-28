package com.project.InventorymanagementSystem.service;

import java.util.List;

import com.project.InventorymanagementSystem.entity.Item;


public interface ItemService {
	
	List<Item> getAllItems();
	
	Item saveItem(Item item);
	
	Item getItemById(long itemcode);
	
	Item updateItem(Item item);

	void deleteItemById(long itemcode);

}
