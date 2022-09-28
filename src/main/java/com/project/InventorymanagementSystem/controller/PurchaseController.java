package com.project.InventorymanagementSystem.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.project.InventorymanagementSystem.entity.PurchaseItem;
import com.project.InventorymanagementSystem.service.ItemService;
import com.project.InventorymanagementSystem.service.PurchaseService;

@Controller
public class PurchaseController {
    @Autowired
	private PurchaseService purchaseService;
    
    @Autowired
    private ItemService itemService;
	
	@PostMapping("/purchaseItem")
	public String placePurchase(@ModelAttribute PurchaseItem purchaseItem)
	{ 
		System.out.println("purchase details: "+purchaseItem);
		purchaseService.placePurchase(purchaseItem);
	return "purchase_item";
	}
	
	@GetMapping("/newpurchase")
	public String newOrder(Model model) {
		model.addAttribute("purchaseItem",new PurchaseItem());
		model.addAttribute("items",itemService.getAllItems());
		return "purchaseItem";
	}
	@GetMapping("/purchaseItem/new")
	public String createPurchase(Model model)
	{
		model.addAttribute("purchaseItem",new PurchaseItem());
		Map<String,Long> map=purchaseService.getNameAndCode();
		model.addAttribute("map",map);
		return "create_purchase";
	}
	
	
}
