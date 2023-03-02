package com.Sele_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableData 
{
	public static WebDriver driver;
	
	
	private static void allData() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");	
		List <WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']"));
		
		for (WebElement Element : allData)
		{
			System.out.println(Element.getText());
		}
	}
	
	private static void singleData() 
	{
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[7]//td[3]"));
		System.out.println(data.getText());
		
	}
	
	private static void columnData() 
	{
		List<WebElement> Cdata =  driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td[3]"));
		for (WebElement Ele : Cdata) {
			System.out.println(Ele.getText());
		}
	}
	public static void main(String[] args) {
		allData();
		singleData(); 
		columnData();
		driver.quit();
	}

		
	

}
