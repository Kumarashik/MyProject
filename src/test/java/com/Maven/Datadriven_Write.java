package com.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
	public static void writeData() throws IOException {
		File f = new File("C:\\Users\\Ashik kumar\\eclipse-workspace\\Maven\\excel\\User_Detail Sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("Data");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Ashik");
		w.getSheet("Data").getRow(0).createCell(1).setCellValue("Kumar");
		w.getSheet("Data").createRow(1).createCell(0).setCellValue(123);
		w.getSheet("Data").getRow(1).createCell(1).setCellValue("Deepa");
		w.getSheet("Data").createRow(2).createCell(0).setCellValue("kiran");
		w.getSheet("Data").getRow(2).createCell(1).setCellValue(456);
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
		
		
	}
	public static void main(String[] args) throws IOException {
		writeData();
	}

}
