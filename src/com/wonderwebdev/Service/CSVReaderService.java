package com.wonderwebdev.Service;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//Handles reading the CSV file containing product data.

public class CSVReaderService {
	
	//stores the instance of the CSVReaderService--is shared
	
	//Declaring the variable: accessModifier/ type / variableName
	private static CSVReaderService csvReaderService = null;
	
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
	
//Implement a method called readProductsFromFile(String filePath) that accepts a file path as an argument
	public void readProductsFromFile(Path path) throws IOException {
			
	//and reads the CSV file line by line, parsing each line 
	System.out.println(Files.readAllLines(path));
	//into the corresponding properties of a new Product object. 
	//store the created Product objects in an ArrayList<Product>.
	}
	
}
