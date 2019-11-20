package com.web.price.model;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 
 
public class TestWriter {
 

    
      
       public static void main(String[] args) throws IOException {
    	   String excelFilePath = "WorkBook3.xlsx";
           
           try {
               FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
               Workbook workbook = WorkbookFactory.create(inputStream);
    
               Sheet sheet = workbook.getSheetAt(0);
    
               Object[] bookData = 
                       {"The hello", "Cdouble hellor", 20};
              
    
               int rowCount = sheet.getLastRowNum();
                   Row row = sheet.createRow(++rowCount);
    
                   int columnCount = 0;
                    
                   Cell cell = row.createCell(columnCount);
                   cell.setCellValue(rowCount);
                    
                   for (Object field : bookData) {
                       cell = row.createCell(++columnCount);
                       if (field instanceof String) {
                           cell.setCellValue((String) field);
                       } else if (field instanceof Integer) {
                           cell.setCellValue((Integer) field);
                       }
                   }
    
               
    
               inputStream.close();
    
               FileOutputStream outputStream = new FileOutputStream("WorkBook3.xlsx");
               workbook.write(outputStream);
               workbook.close();
               outputStream.close();
                
           } catch (IOException | EncryptedDocumentException
                   | InvalidFormatException ex) {
               ex.printStackTrace();
           }
       
       }
 
}
 
