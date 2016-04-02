package com.somitsolutions.java.training.salestax;

//This is the Strategy Interface. Its kind of based upon open-closed principles meaning
//open for extension and closed for modification.

public interface SalesTaxStrategy {
	
	public float calculateTax(float price, float salestaxRate, float importDuty);

}
