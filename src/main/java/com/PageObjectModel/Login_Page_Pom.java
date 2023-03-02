package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Pom {
	
	public WebDriver driver;
	
	@FindBy(id="username") WebElement username;
	@FindBy(xpath ="//input[@id='password']")private WebElement password;
	@FindBy(id="login")private WebElement login;
	
	public Login_Page_Pom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getusername() {	
		return username;
	}
	public WebElement getpassword() {
		return password;
	}
	public WebElement getlogin() {
		return login;
	}
}
