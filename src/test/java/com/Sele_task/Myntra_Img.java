package com.Sele_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra_Img {	
		public static WebDriver driver;
		
		public static void openBrowser(String url) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
		}
		/*
		public void getNoOfImages() 
		{
			List<WebElement> images = driver.findElements(By.tagName("img"));
			System.out.println("No.of.images:" + images.size());
			
		}
		*/
		private void getNoOfProducts() 
		{
			List<WebElement> products = driver.findElements(By.xpath("//li[@class='product-base']"));
			System.out.println("No of products in this page " + products.size());
			for (WebElement shirt : products) 
			{
				System.out.println("The name of the products are: " + shirt.getText());
			}
		}
		
//		public void minPrice() 
//		{
//			List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class='product-price']"));
//			//List<Integer> priceint = new ArrayList<>(); 
//					
//			for (WebElement price : pricelist)
//			{
//				String pricestring = price.getText().replaceAll("\\D", "");
//				//priceint.add(null)
//				System.out.println(pricestring);
//			}
//		}
		// Online Class method 
		private void getMinPrice() {
			List<WebElement> allPrice = driver.findElements(
					By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i< allPrice.size(); i++) 
			{
				String value = allPrice.get(i).getText().replaceAll("Rs. ", "");
				int number = Integer.parseInt(value);
				list.add(number);
			}
			Integer minPrice = Collections.min(list);
			System.out.println("The minimum out of all products : " + minPrice);
			
//			Integer maxPrice = Collections.max(list);
//			System.out.println("The maximum out of all products : " + maxPrice);
		}
		The below line is the real Xpath
		//li[@class='product-base']//descendant::span[@class='product-discountedPrice']
		//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']
		
		private void getMinBrandName(Integer minPrice) 
		{
			WebElement minBrandName = driver.findElement(
					By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']//"
							+ "ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']")); 

		}
		public static void main(String[] args) 
		{
			Myntra_Img m = new Myntra_Img();
			m.openBrowser("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
			//m.getNoOfProducts();
			m.getMinPrice();
		}

}
