package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	@BeforeSuite
	public void bed() {
		System.out.println("bed");
	}
		
	@BeforeTest
	public void house() {
		System.out.println("house");
	}
	
	
	@BeforeClass
	public void road() {
		System.out.println("road");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	@Test(priority = 0)
	public void women() {
		System.out.println("women");
		
	}
	@Test(priority = -1,invocationCount = 2)
	public void men() {
		System.out.println("men");
	}
	@Test(priority = 1)
	public void kids() {
		System.out.println("kids");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@AfterClass
	public void sleep() {
		System.out.println("sleep");
		
	}
	@AfterTest
	public void dream() {
		System.out.println("dream");
	}
	@AfterSuite
	public void work() {
		System.out.println("work");
	}
}
