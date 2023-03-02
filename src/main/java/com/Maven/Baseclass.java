package com.Maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	
	//browser launch
	public static WebDriver launchBrowser(String browsername) 
	{
		if (browsername.equalsIgnoreCase("chrome"))
		{
//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		
		 
		
		else if (browsername.equalsIgnoreCase("firefox")) 
		{
			
//		System.setProperty("webdriver.gecko.driver",
//				System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
	
	}
	
	
	//URL launch
	public static void getUrl(String url)
	{
		driver.get(url);
	}
	
	//close browser
	public static void closeTab()
	{
		driver.close();
	}
	
	//quit browser
	public static void terminateBrowser()
	{
		driver.quit();
	}
	
	//send keys
	public static void passInput(WebElement element, String keys)
	{
		element.sendKeys(keys);	
	}
	
	//click
	public static void clickOnElement(WebElement element) 
	{
		element.click();
	}
	
	//Navigate to
	public static void navigateTo(String url) 
	{
		driver.navigate().to(url);
	}
	
	//Navigate back
	public static void back() 
	{
		driver.navigate().back();
	}
	
	//Navigate forward
	public static void forward() 
	{
		driver.navigate().forward();		
	}
	
	//Refresh
	public static void refresh() 
	{
		driver.navigate().refresh();
	}
	
	//Alert
	public static void Alert(WebElement element, Boolean condition ) 
	{
		element.click();
		Alert first		
	}
	
	//Action (All methods from action class)
	public static void Action() 
	{		
		
	}
	
	//Frames
	public static void frame() {
		
	}
	
	//Robot
	public static void Robot() {
		
	}
	
	//Window Handles 
	public static void handle() {
		
	}
	
	//Dropdown
	public static void dropdown() {
		
	}
	
	//checkbox
	public static void checkbox() {
		
	}
	
	//is enable
	public static void isEnable() {
		
	}
	
	//is displayed
	public static void isDisplayed() {
		
	}
	
	//is selected
	public static void isSelected() {
		
	}
	
	//Get options
	public static void getOptions() {
		
	}
	
	//Get Title
	public static void getTitle() 
	{
		
	}
	
	//Get current URL
	public static void getCurrentUrl() 
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	//Get Text
	public static void getText(WebElement element) 
	{
		String text = element.getText();
		System.out.println(text);
	}
	
	//Get attribute
	public static void getAttribute(WebElement element, String value) 
	{
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}
	
	//Wait
	public static void wait() {
		
	}
	//Take Screenshot
	public static void Screenshot(String filename) throws IOException {
		
		/*
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Scrnshot\\home.png");
		FileUtils.copyFile(src, trg);
		*/
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File( ".\\Screenshot\\"+filename+".png"));
	}
	//scroll up
	public static void scrollUp() {
		
	}
	//scroll down'
	public static void scrolldown() {
		
	}
	//get first select options
	public static void getFirstSelectedOptions() {
		
	}
	// get all selected options
	public static void getAllSelectedOptions() {
		
	}
	//is multiple
	public static void isMultiple() {
		
	}
	//Radio Button
	public static void radioButton() {
		
	}
}
