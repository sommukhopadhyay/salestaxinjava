package com.somitsolutions.java.training.salestax;

public class TaxStrategyWithBothSalesTaxAndImportDuty implements SalesTaxStrategy{

	
	public TaxStrategyWithBothSalesTaxAndImportDuty(){
		
	}
	@Override
	public float calculateTax(float price, float salestaxRate, float importDuty) {
		// TODO Auto-generated method stub
		float tax = price*salestaxRate/100 + price*importDuty/100;
		return tax;
	}

}
