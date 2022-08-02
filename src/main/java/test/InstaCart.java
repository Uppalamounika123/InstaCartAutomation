package test;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.CommonBaseClass;
import common.ConfigFileReader;
import common.baseClass;
import pages.InstaCartPage;



public class InstaCart extends CommonBaseClass{
	
	
	static Properties properties; 
	
	@BeforeMethod
	public void beforeEachTest() {
		openURL(ConfigFileReader.getProperty("baseURL"));
		
	}
	@AfterMethod
	public void afterEachTest() {
		
	}
	
	
	@Test
	public void submitForm() throws Exception {
		
			InstaCartPage InstaCartPage=PageFactory.initElements(driver, InstaCartPage.class);	
			waitForPageToLoad(7);
		waitForPageToLoad(7);
		scroll();
		scroll();
		scroll();
		InstaCartPage.getQuestionAndAnswers();
	}
	
}