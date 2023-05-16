package com.wonderwebdev.Service;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.wonderwebdev.domain.Product;

//Handles reading the CSV file containing product data.

public class CSVReaderService {
	
	//stores the instance of the CSVReaderService--is shared
	
	//Declaring the variable: accessModifier/ type / variableName
	private static CSVReaderService csvReaderService = null;
	 private List<Product> products = new ArrayList<>();
	 
	//private no argument constructor creates singleton pattern
	private CSVReaderService( ) {
		
	}
	public static CSVReaderService getInstance() {
		if(csvReaderService == null) {		
		csvReaderService = new CSVReaderService();
		}
		//returns existing class NOT new instance
		return csvReaderService;
	}

	public List<Product> getProducts() {
		return products;
	}
//Implement a method called readProductsFromFile(String filePath) that accepts a file path as an argument
	public void readProductsFromFile(Path path) throws IOException {
	try {		
	
		//and reads the CSV file line by line, 
			List<String> data = Files.readAllLines(path);//Returns a list(interface) extending from a collection
			//parsing each line into the corresponding properties 
			//of a new Product object. 
			data.stream()
			.forEach((String lineOfData) -> {
					try {
						
						String[] productData = lineOfData.split(",");
						if (productData.length == 4) {		
						Product product = new Product();
						product.setId(Integer.parseInt(productData[0].trim()));
						product.setName(productData[1]);
						product.setQuantity(Integer.parseInt(productData[2].trim()));
						product.setPrice(Double.parseDouble(productData[3].trim()));
						//store the created Product objects in an ArrayList<Product>.
						products.add(product);
						}
						
					} catch (NumberFormatException e) {
						System.out.println("Program cannot read the file.");
						e.printStackTrace();
					}
			
			});


	} catch(IOException e){
	 System.out.println("Program cannot read the file.");
	 e.printStackTrace();
	}
 }
}