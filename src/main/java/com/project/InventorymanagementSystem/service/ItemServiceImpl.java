package com.project.InventorymanagementSystem.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.project.InventorymanagementSystem.entity.Item;
import com.project.InventorymanagementSystem.repository.ItemRepository;


@Service
public class ItemServiceImpl implements ItemService{

	private ItemRepository itemRepository;
	public ItemServiceImpl(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	@Override
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

	@Override
	public Item saveItem(Item item) {
		return itemRepository.save(item);
	}

	@Override
	public Item getItemById(long itemcode) {
		 
        System.out.println("ItomCode:   "+itemcode);		
		
		Optional<Item> optional = itemRepository.findById(itemcode);
		Item item = null;
		if (optional.isPresent()) {
			item = optional.get();
		} else {
			throw new RuntimeException("Item not found for id :: " + itemcode);
		}
		return item;
	}

	@Override
	public Item updateItem(Item item) {
		return itemRepository.save(item);
	}

	@Override
	public void deleteItemById(long itemcode) {
		itemRepository.deleteById(itemcode);	
	}

	
	

	
}

