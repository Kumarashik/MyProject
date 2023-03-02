package com.testng;

import org.testng.annotations.Test;

public class Grouping_Concepts {
	@Test(groups = "numbers")
	public void one () {
		System.out.println("1");
	}
	@Test(groups = "numbers")
	public void two () {
		System.out.println("2");
	}
	@Test(groups = "integers")
	public void three() {
		System.out.println("3");
	}
	@Test(groups = "integers")
	public void four() {
		System.out.println("4");
	}

}
