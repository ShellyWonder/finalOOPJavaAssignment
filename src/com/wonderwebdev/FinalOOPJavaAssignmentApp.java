package com.wonderwebdev;
import java.io.IOException;
import java.nio.file.Path;

import com.wonderwebdev.Service.CSVReaderService;
public class FinalOOPJavaAssignmentApp {

	public static void main(String[] args) throws IOException {
		
    CSVReaderService cSVReaderService = CSVReaderService.getInstance();
    cSVReaderService.readProductsFromFile(Path.of("sampleInventory.txt"));
    
	}

}
