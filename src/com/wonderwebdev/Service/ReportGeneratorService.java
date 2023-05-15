package com.wonderwebdev.Service;

import java.util.List;

import com.wonderwebdev.domain.Product;

public class ReportGeneratorService {
	
	String message = "Inventory low. Please reorder now. ";
	public void generateLowInventoryReport(List<Product>products) {
		for (Product product : products) {
			if((product.getPrice()>= 0.99 && product.getPrice() <= 100.00 && product.getQuantity() <= 20) 
					|| (product.getPrice()>= 101.00 && product.getQuantity() <= 10) ) {
				
				System.out.println(message + ": " + product.getId() + " " + product.getName() + " " + product.getQuantity());
			}
			
			
		}
	}
}
