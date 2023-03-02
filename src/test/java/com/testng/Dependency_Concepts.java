package com.testng;

import org.testng.TestException;
import org.testng.annotations.Test;

public class Dependency_Concepts {
	@Test
	public void credentials() {
		System.out.println("validw cred");
	}
	
	@Test(expectedExceptions = TestException.class)
	public void browser() {
		System.out.println("browser");
	}
	
	@Test(dependsOnMethods = "credentials")
	public void login() {
		
		System.out.println("login");
	}
	@Test(timeOut = 200)
	public void logout() {
		System.out.println("logout");
	}
	
	

}
