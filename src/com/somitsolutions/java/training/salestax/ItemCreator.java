package com.somitsolutions.java.training.salestax;

public class ItemCreator {
	
	public enum ItemType{
		ITEM_WITH_NOSALESTAX_AND_NOIMPORTDUTY,
		ITEM_WITH_ONLY_SALESTAX_AND_NOIMPORTDUTY,
		ITEM_WITH_NOSALESTAX_AND_ONLY_IMPORTDUTY,
		ITEM_WITH_BOTH_SALESTAX_AND_IMPORTDUTY
	}
	private static Item item;
	
	public static Item createItem(ItemType type){

		switch (type){
		case ITEM_WITH_NOSALESTAX_AND_NOIMPORTDUTY:
			item = new Item();
			item.setTaxStrategy(new TaxStrategyWithNoSalesTaxAndNoImportDuty());
			break;
			
		case ITEM_WITH_ONLY_SALESTAX_AND_NOIMPORTDUTY:
			item = new Item();
			item.setTaxStrategy(new TaxStaregyWithOnlySalesTaxAndNoImportDuty());
			break;
			
		case ITEM_WITH_NOSALESTAX_AND_ONLY_IMPORTDUTY:
			item = new Item();
			item.setTaxStrategy(new TaxStrategyWithOnlyImportDutyAndNoSalesTax());
			break;
			
		case ITEM_WITH_BOTH_SALESTAX_AND_IMPORTDUTY:
			item = new Item();
			item.setTaxStrategy(new TaxStrategyWithBothSalesTaxAndImportDuty());
			break;
		}
		
		return item;
			
	}
		
	public static Item getItem(){
		return item;
	}

}
