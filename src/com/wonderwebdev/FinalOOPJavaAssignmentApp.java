package com.wonderwebdev;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import com.wonderwebdev.Service.CSVReaderService;
import com.wonderwebdev.Service.ReportGeneratorService;
import com.wonderwebdev.domain.Product;
public class FinalOOPJavaAssignmentApp {

	public static void main(String[] args) throws IOException {
	
    CSVReaderService cSVReaderService = CSVReaderService.getInstance();
    List<Product>products = cSVReaderService.readProductsFromFile(Path.of("sampleInventory.txt"));
    ReportGeneratorService reportGeneratorService = new ReportGeneratorService();
    reportGeneratorService.getProductCount(products);
    reportGeneratorService.generateLowInventoryReport(products);
    
	}

}
