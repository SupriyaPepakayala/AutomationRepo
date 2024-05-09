package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.pageObjectManager;

public class testContextSetup {
	
 public WebDriver driver;
 public String productName;
 public TestBase testBase;
 public pageObjectManager pageObjMan;
 public genericUtils genericUtil;
 public String offerpageproductName;
 
 public testContextSetup() throws IOException {
	 testBase=new TestBase();
	 pageObjMan=new pageObjectManager(testBase.Intialization());
	 genericUtil=new genericUtils(testBase.Intialization());
	 
 }
 
 
	
	
}
