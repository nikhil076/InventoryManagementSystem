package com.bridgelabz.objectOrientedPrograms;

import java.util.LinkedList;
import java.util.Scanner;

public class InventoryManagementServiceImpl implements InventoryManagementService
{

	LinkedList<Items> itemList = new LinkedList<>();
	//To add the items in the linked list
	@Override
	public void addInventoryItems(Items items) 
	{
		if(itemList.contains(items))
		{
			System.out.println("Items exist in Inventory");
		}
		itemList.add(items);
	}
	//to get all the items in the linkedlist
	@Override
	public void getInventory() 
	{
		for (Items items : itemList) 
		{
			System.out.println(items);
		}
	}
	//To get the item by name given by the user
	@Override
	public void getInventoryByName(String itemName) 
	{
		for (Items items : itemList) 
		{
			if(items.getItemName().equals(itemName))
			{
				System.out.println(items);
				break;
			}
			else
				System.out.println("Not Found");
				break;
		}
	}
	//To Calculate the price of different items in the linkedlist
	@Override
	public void calculateItems() 
	{
		for (Items items : itemList) 
		{
			double value = items.getItemWeight()*items.getItemPricePerKg();
			System.out.println("The value of "+items.getItemName()+" is :"+value);
		}
	}
	//To edit details of the item by name given by user
	@Override
	public void editItemsByName(String itemName) 
	{
		for (Items items : itemList) 
		{
			if(items.getItemName().equals(itemName))
			{
				Scanner scanner = new Scanner(System.in);
				System.out.println("Old Data : "+items);
				System.out.println("Enter the new Weight of item :");
				items.setItemWeight(scanner.nextDouble());
				System.out.println("Enter the new Price per kg of item :");
				items.setItemPricePerKg(scanner.nextDouble());
				System.out.println("New Data : "+items);
				scanner.close();
			}
		}
	}
	
}
