package com.somitsolutions.java.training.salestax;

public class TaxStrategyWithOnlyImportDutyAndNoSalesTax implements SalesTaxStrategy{

	public TaxStrategyWithOnlyImportDutyAndNoSalesTax(){
		
	}
	@Override
	public float calculateTax(float price, float salestaxRate, float importDuty) {
		// TODO Auto-generated method stub
		
		float tax = price*importDuty/100;
		return tax;
	}

}
