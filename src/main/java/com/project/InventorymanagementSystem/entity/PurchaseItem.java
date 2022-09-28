package com.project.InventorymanagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="purchaseItems")
public class PurchaseItem {
	
	private long itemCode;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long inwardId;
	private String inwardDate;
	private long quantity;
	

	public long getItemCode() {
		return itemCode;
	}

	public void setItemCode(long itemCode) {
		this.itemCode = itemCode;
	}

	public long getInwardId() {
		return inwardId;
	}

	public void setInwardId(long inwardId) {
		this.inwardId = inwardId;
	}

	public String getInwardDate() {
		return inwardDate;
	}

	public void setInwardDate(String inwardDate) {
		this.inwardDate = inwardDate;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

		
}


	