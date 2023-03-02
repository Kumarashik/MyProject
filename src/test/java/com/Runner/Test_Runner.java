package com.Runner;

import org.junit.runner.RunWith;
import cucumber.api.*;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature",glue = "com.Step_Definition")
public class Test_Runner {
	

}
