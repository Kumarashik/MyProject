package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	
	
	@Ignore
	@Test
	public void one () {
		System.out.println("1");
	}
	@Test
	public void two () {
		System.out.println("2");
	}
	@Test(enabled = false)
	public void three() {
		System.out.println("3");
	}
	@Test
	public void four() {
		System.out.println("4");
	}

}
