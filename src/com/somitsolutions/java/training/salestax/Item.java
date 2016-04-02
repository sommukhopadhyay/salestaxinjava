package com.somitsolutions.java.training.salestax;

//This class has a reference to the SalesTaxStrategy interface.
//This is called loose coupling because the client is coupled with the abstract 
//interface and not any concrete realization. Its sometimes called Abstract Coupling
//The actual implementation is nicely hidden from the client.
public class Item {
	
	public static final int salesTaxRate = 10;
	public static final int importDutyRate = 5;
	
	private SalesTaxStrategy taxStrategy;
	private float price;
	private float salesTax;
	private float importDuty;
	

	public Item(){
		taxStrategy = null;
		setPrice(0);
		setSalesTax(0);
		setImportDuty(0);
	}
	
	
	public SalesTaxStrategy getTaxStrategy() {
		return taxStrategy;
	}

	public void setTaxStrategy(SalesTaxStrategy taxStrategy) {
		this.taxStrategy = taxStrategy;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public float getSalesTax() {
		return salesTax;
	}


	public void setSalesTax(float salesTax) {
		this.salesTax = salesTax;
	}


	public float getImportDuty() {
		return importDuty;
	}


	public void setImportDuty(float importDuty) {
		this.importDuty = importDuty;
	}

	public float totalTax(){
		
		//the data that the concrete strategy classes need are sent from the Item.
		//This may create communication overhead. For example the 
		//TaxStrategyWithNoSalesTaxAndNoImportDuty class really does not need
		//the last two data. Still we need to pass it. This is one of the drawbacks of
		//the Strategy Design Pattern
		return taxStrategy.calculateTax(price, salesTaxRate, importDutyRate);
		
	}

}
