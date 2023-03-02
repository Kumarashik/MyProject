package com.Sele_task;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Maven.Baseclass;

public class TestBaseClass extends Baseclass
{
public static void main(String[] args) throws IOException {
	launchBrowser("chrome");
	launchUrl("https://www.google.co.in/");
	WebElement searchbox =driver.findElement(By.xpath("//a[normalize-space()='Gmail']"));
	String s = searchbox.getText();
	System.out.println(s);
	
	//closeTab();
}
}
