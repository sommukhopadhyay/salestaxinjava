package com.somitsolutions.java.training.salestax;

public class TaxStaregyWithOnlySalesTaxAndNoImportDuty implements
		SalesTaxStrategy {

	public TaxStaregyWithOnlySalesTaxAndNoImportDuty(){
		
	}
	@Override
	public float calculateTax(float price, float salestaxRate, float importDuty) {
		// TODO Auto-generated method stub
		
		float tax = price*salestaxRate/100;
		
		return tax;
	}

}
