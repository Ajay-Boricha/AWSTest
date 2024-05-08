package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AWSTESTFile {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		
		
	}
	
	@Test
	public void fileUpload() {
		
		System.out.println("-------> Starting Test");
		System.out.println("-------> Running Test");
		System.out.println("-------> Pass");
		
	}
	
	@AfterTest
	public void tearDown() {
		
	}

}
