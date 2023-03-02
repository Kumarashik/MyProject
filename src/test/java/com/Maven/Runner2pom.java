package com.Maven;

import org.openqa.selenium.WebElement;

import com.PageObjectModel.Login_Page_Pom;

public class Runner2pom extends Baseclass{
	public static void main(String[] args) {
		   	launchBrowser("chrome");
		   	launchUrl("https://adactinhotelapp.com/");
		   	
		   	Login_Page_Pom page = new Login_Page_Pom(driver);
		   	
		   	
		   	passinput(page.getusername(), "Ashikkumar");
		   	
		   	passinput(page.getpassword(),"Qwertyuiop@1");
		   	
		   	clickOnElement(page.getlogin());
	}

}
