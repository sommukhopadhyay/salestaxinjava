package com.somitsolutions.java.training.salestax;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = ItemCreator.createItem(ItemCreator.ItemType.ITEM_WITH_ONLY_SALESTAX_AND_NOIMPORTDUTY);
		
		item1.setPrice(10.05f);
		
		float tax1 = item1.totalTax();
		
		System.out.println("The tax for Item1 is : " + Float.toString(tax1));
		
		Item item2 = ItemCreator.createItem(ItemCreator.ItemType.ITEM_WITH_NOSALESTAX_AND_NOIMPORTDUTY);
		
		item2.setPrice(12.0f);
		
		float tax2 = item2.totalTax();
		
		System.out.println("The tax for Item1 is : " + Float.toString(tax2));
		
	}

}
