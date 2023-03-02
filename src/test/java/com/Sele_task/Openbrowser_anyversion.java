package com.Sele_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openbrowser_anyversion {
	private static void openBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		

	}
	public static void main(String[] args) {
		openBrowser("https://www.myntra.com/");
	}

}
