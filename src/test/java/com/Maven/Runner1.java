package com.Maven;

import java.io.IOException;

public class Runner1 extends Baseclass{
	public static void main(String[] args) throws IOException {
		launchBrowser("chrome");
		
		launchUrl("https://github.com/mozilla/geckodriver/releases/");
		
		Screenshot("1");
		
		terminateBrowser();
		
		
		
	}
	

}
