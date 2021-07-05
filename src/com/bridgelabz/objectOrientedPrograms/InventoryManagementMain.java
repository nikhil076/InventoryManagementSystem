package com.bridgelabz.objectOrientedPrograms;

import java.util.Scanner;

public class InventoryManagementMain
{

	public static void main(String[] args)
	{
		InventoryManagementService inventoryManagement = new InventoryManagementServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inventory Management System");

		System.out.println("Enter the number of Items required for the inventory :");
		int noOfItems = scanner.nextInt();
		
		for (int index = 0; index < noOfItems; index++) 
		{
			Items items = new Items();
			System.out.println("Enter the name of Item :");
			items.setItemName(scanner.next());
			System.out.println("Enter the weight of the item :");
			items.setItemWeight(scanner.nextDouble());
			System.out.println("Enter the Price of the item for per kg :");
			items.setItemPricePerKg(scanner.nextDouble());
			inventoryManagement.addInventoryItems(items);
		}
		System.out.println("Press \n '1' to display the inventory \n '2' to search a item in the inventory using name  \n '3' to calculate the price of the items in the inventory  \n '4' to edit the items in the inventory by the item name ");
		int key = scanner.nextInt();
		switch (key) 
		{
			case 1:
			{
				inventoryManagement.getInventory();
				break;
			}
			case 2:
			{
				System.out.println("Enter the item name to check the inventory");
				inventoryManagement.getInventoryByName(scanner.next());
				break;
			}
			case 3:
			{
				inventoryManagement.calculateItems();
				break;
			}
			case 4:
			{
				System.out.println("Enter the name of item to change its details");
				inventoryManagement.editItemsByName(scanner.next());
				break;
			}
		default:
			System.out.println("Invalid number");
		}	
	}
}
