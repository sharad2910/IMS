package com.project.InventorymanagementSystem.service;

import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.InventorymanagementSystem.entity.Item;
import com.project.InventorymanagementSystem.entity.PurchaseItem;
import com.project.InventorymanagementSystem.repository.PurchaseRepository;

@Service
public class PurchaseService {
	
@Autowired
	private PurchaseRepository purchaseRepository;
	
@Autowired
private ItemService itemService;
	
public PurchaseItem placePurchase(PurchaseItem purchaseItem)
	{
		Item item=itemService.getItemById(purchaseItem.getItemCode());
		System.out.println("before Update item: "+item);
		
		//@TODO: validation required for check the available quantity it greater than order quantity
		
		try {
			item.setAvailableQuantity(item.getAvailableQuantity()+purchaseItem.getQuantity());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after Update item: "+item);
		itemService.updateItem(item);
		return purchaseRepository.save(purchaseItem);
	}
	
	
	 public Map<String,Long> getNameAndCode()
	 {
		  return itemService.getAllItems().stream().collect(Collectors.toMap(value->value.getItemName(), value->value.getItemCode()));
	 }
	 
	

}
