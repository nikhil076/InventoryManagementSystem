package com.bridgelabz.objectOrientedPrograms;

public interface InventoryManagementService 
{
	
	public void addInventoryItems(Items items);
	public void getInventory();
	public void getInventoryByName(String itemName);
	public void calculateItems();
	public void editItemsByName(String itemName);
}
