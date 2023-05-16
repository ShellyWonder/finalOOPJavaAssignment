package com.wonderwebdev.Service;

import java.util.List;

import com.wonderwebdev.domain.Product;

public class ReportGeneratorService {
	
	public void getProductCount(List<Product> products) {
	    if (products == null) {
	        
	     System.out.println("There are no products in inventory. ");
	    }
	    
        System.out.println("There are " + products.size() + " products in inventory.");
	}

	public void generateLowInventoryReport(List<Product> products) {
	    String message = "Low Inventory.Please reorder now";
	    boolean allProductsInAcceptableQuantities = true;
	    
	    for (Product product : products) {
	        if ((product.getPrice() >= 0.99 && product.getPrice() <= 100.00) && (product.getQuantity() <= 20)) {
	            System.out.println(message + ": " + product.getId() + " " + product.getName() + " " + product.getQuantity());
	            allProductsInAcceptableQuantities = false;
	        }
	        else if (product.getPrice() >= 101.00 && product.getQuantity() <= 10) {
	            System.out.println(message + ": " + product.getId() + " " + product.getName() + " " + product.getQuantity());
	            allProductsInAcceptableQuantities = false;
	        }
	    }
	    
	    if (allProductsInAcceptableQuantities) {
	        System.out.println("All products in inventory within acceptable quantities");
	    }
	}

}
