package com.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;


public class Datadriven 
{
	public static void main(String[] args) throws IOException
	{
		Datadriven D = new Datadriven();
		D.readAllData();
		D.readparticularData();
	}
	public static void readAllData() throws IOException 
	{
		File f = new File("C:\\Users\\Ashik kumar\\eclipse-workspace\\Maven\\excel\\User_Detail Sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows=sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) 
		{
			Row r = sheetAt.getRow(i);
			int numberOfCells= r.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) 
			{
				Cell cell = r.getCell(j);
			
				
				org.apache.poi.ss.usermodel.CellType 
				cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) 
				{
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if (cellType.equals(cellType.NUMERIC)) 
				{
					double value = cell.getNumericCellValue();
					int num = (int) value;
					System.out.println(num);
					
				}
			}
		}
	}
	public static void readparticularData() throws IOException{
		File f = new File("C:\\Users\\Ashik kumar\\eclipse-workspace\\Maven\\excel\\User_Detail Sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row r = sheetAt.getRow(2);
		Cell cell = r.getCell(1);
		org.apache.poi.ss.usermodel.CellType cellT = cell.getCellType();
		if (cellT.equals(cellT.STRING)) 
		{
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		else if (cellT.equals(cellT.NUMERIC)) 
		{
			double value = cell.getNumericCellValue();
			int num = (int) value;
			System.out.println(num);
		}
		
		
	}



}
			
			
				
		
		
		
		
	

	

