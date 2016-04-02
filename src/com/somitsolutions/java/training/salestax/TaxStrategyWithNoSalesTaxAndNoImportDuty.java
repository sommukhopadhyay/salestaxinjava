package com.somitsolutions.java.training.salestax;

public class TaxStrategyWithNoSalesTaxAndNoImportDuty implements SalesTaxStrategy{

	@Override
	public float calculateTax(float price, float salestaxRate, float importDuty) {
		// TODO Auto-generated method stub
		return 0;
	}

}
