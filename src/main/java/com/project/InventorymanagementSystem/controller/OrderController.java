package com.project.InventorymanagementSystem.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.project.InventorymanagementSystem.entity.Order;
import com.project.InventorymanagementSystem.service.ItemService;
import com.project.InventorymanagementSystem.service.OrderService;

@Controller
public class OrderController {
    @Autowired
	private OrderService orderService;
    
    @Autowired
    private ItemService itemService;
	
	@PostMapping("/order")
	public String placeOrder(@ModelAttribute Order order)
	{ 
		System.out.println("order details: "+order);
		orderService.placeOrder(order);
		return "order_sell";
	}
	
	@GetMapping("/neworder")
	public String newOrder(Model model) {
		model.addAttribute("order",new Order());
		model.addAttribute("items",itemService.getAllItems());
		return "order";
	}
	@GetMapping("/order/new")
	public String createOrder(Model model)
	{
		model.addAttribute("order",new Order());
		Map<String,Long> map=orderService.getNameAndCode();
		model.addAttribute("map",map);
		return "create_order";
	}
	
	
}
