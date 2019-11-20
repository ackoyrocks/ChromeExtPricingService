package com.web.price.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.web.price.model.HDProductInfo;
//import com.web.price.model.Product;


@Service("writeExcelService")
public class WriteExcel {

public  void writeDataToExcel(HDProductInfo product,String lowesPrice) throws IOException{
		
		java.util.Date date = new java.util.Date();
	    
	        String FILE_NAME = "C:/Users/akanand/workspace/Hackthon/PriceServiceMain/WorkBook3.xlsx";
	        
	    	FileInputStream fsIP = null;
			XSSFWorkbook workbook = null;
		
				File file = new File(FILE_NAME);
	
				

				fsIP = new FileInputStream(file);
				workbook = new XSSFWorkbook(fsIP);
				

				XSSFSheet sheet = workbook.getSheet("DataCollection");
	        
				XSSFRow lastDataRow = null;
				XSSFRow dataRow = null;
	        lastDataRow = sheet.getRow(sheet.getLastRowNum());
	        dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
	        dataRow.createCell(0).setCellValue(date.toString());
	        dataRow.createCell(1).setCellValue(product.getBrand());
			dataRow.createCell(2).setCellValue(product.getProductDesc());
			dataRow.createCell(3).setCellValue(product.getModelNo());
			dataRow.createCell(4).setCellValue(product.getWas());
			dataRow.createCell(5).setCellValue(product.getSpecialBuy());
			dataRow.createCell(6).setCellValue(product.getSavingText());
			dataRow.createCell(7).setCellValue(product.getHdprice());
			dataRow.createCell(8).setCellValue(lowesPrice);
			//dataRow.createCell(3).setCellValue(NumberToTextConverter.toText(Double.parseDouble(writeData.get("PRODUCT_LIST"))));
			//dataRow.createCell(4).setCellValue(NumberToTextConverter.toText(Double.parseDouble(writeData.get("PRODUCT_DETAIL"))));
	       
			fsIP.close();
			FileOutputStream output_file = new FileOutputStream(file);

			workbook.write(output_file);
			output_file.close();
			
	}

	//Product product;
	/*public  void writeDataToExcel(HDProductInfo product, String lowesPrice) throws IOException{
		
		 String excelFilePath = "C:/Users/akanand/workspace/Hackthon/PriceServiceMain/WorkBook3.xlsx";
		 int rowCount = 0 ;
		 //File currDir = new File(".");C:\Users\akanand\workspace\Hackthon\PriceServiceMain
		    //String path = currDir.getAbsolutePath();
		   // System.out.println(path);
		 if(null != product)
		 {
			 List<String> tempObject = new ArrayList<String>();
	         tempObject.add(product.getBrand());
	         tempObject.add(product.getProductDesc());
	         tempObject.add(product.getModelNo());
	         tempObject.add(product.getWas());
	         tempObject.add(product.getSpecialBuy());
	         tempObject.add(product.getSavingText());
	         //tempObject.add(product.getStoreNumber());
	         tempObject.add(product.getHdprice());
	         tempObject.add(lowesPrice);
	         
	         try {
	             FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	             Workbook workbook = WorkbookFactory.create(inputStream);
	  
	             Sheet sheet = workbook.getSheetAt(0);
	            
	             
	             CellReference ref = new CellReference("R1");
	             Row r = sheet.getRow(ref.getRow());
	             if (r != null) {
	                Cell c = r.getCell(ref.getCol());
	               Double currentValue =  c.getNumericCellValue();
	                System.out.println(c);
	                rowCount = currentValue.intValue();
	                c.setCellValue(currentValue + 1.0);
	             }
	             System.out.println(rowCount);
	                 Row row = sheet.getRow(rowCount);
	                 int columnCount = 0;
	                  
	                 Cell cell = row.createCell(columnCount);
	                 cell.setCellValue(rowCount);
	                  
	                 for (String field : tempObject) {
	                     cell = row.createCell(++columnCount);
	                         cell.setCellValue((String) field);
	                 }

	                 inputStream.close();
	  
	             FileOutputStream outputStream = new FileOutputStream("C:/Users/akanand/workspace/Hackthon/PriceServiceMain/WorkBook3.xlsx");
	             workbook.write(outputStream);
	             workbook.close();
	             outputStream.close();
	              
	         } catch (IOException | EncryptedDocumentException
	                 | InvalidFormatException ex) {
	             ex.printStackTrace();
	         } 
		 }
		 
			
	}*/

}
