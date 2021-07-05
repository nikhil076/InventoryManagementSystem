package com.bridgelabz.objectOrientedPrograms;

public class Items 
{
	private String itemName;
	private double itemWeight;
	private double itemPricePerKg;
	
	public String getItemName() 
	{
		return itemName;
	}
	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}
	public double getItemWeight() 
	{
		return itemWeight;
	}
	public void setItemWeight(double itemWeight) 
	{
		if(itemWeight<=0.0)
		{
			System.out.println("Weight should be greater than 0");
		}
		this.itemWeight = itemWeight;
	}
	public double getItemPricePerKg() 
	{
		return itemPricePerKg;
	}
	public void setItemPricePerKg(double itemPricePerKg) 
	{
		if(itemPricePerKg<=0.0)
		{
			System.out.println("Price per kg should be greater than 0");
		}
		this.itemPricePerKg = itemPricePerKg;
	}
	@Override
	public String toString()
	{
		return "Items [itemName=" + itemName + ", itemWeight=" + itemWeight + ", itemPricePerKg=" + itemPricePerKg
				+ "]";
	}
	
}
