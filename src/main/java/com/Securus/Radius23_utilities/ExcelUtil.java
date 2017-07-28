package com.Securus.Radius23_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class ExcelUtil {
	
	public static String getData(String column)
	{
		
		try {
			FileInputStream inputStream = new FileInputStream("C:/Users/myeddulappalli/Desktop/TestDataFile.xls");
			HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
			
	        Sheet firstSheet = workbook.getSheet("Login");
	        Iterator<Row> iterator = firstSheet.iterator();
	        while(iterator.hasNext())
	        {
	        	Row nextRow=iterator.next();
	        	Iterator<Cell> cellIterator = nextRow.cellIterator();
	        	while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                 
	                switch (cell.getCellType()) {
	                    case Cell.CELL_TYPE_STRING:
	                        System.out.print(cell.getStringCellValue());
	                        break;
	                    case Cell.CELL_TYPE_BOOLEAN:
	                        System.out.print(cell.getBooleanCellValue());
	                        break;
	                    case Cell.CELL_TYPE_NUMERIC:
	                        System.out.print(cell.getNumericCellValue());
	                        break;
	                }
	                System.out.print(" - ");
	            }
	            System.out.println();
	        }
	        
		} catch (Exception e) {
			System.out.println("Trouble reading data from file");
			e.printStackTrace();
		}
		return column;
		
	}
	
	public static void main(String[] s)
	{
		
	}
	
	

}
