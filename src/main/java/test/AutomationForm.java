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
import pages.AutomationFormPage;



public class AutomationForm extends CommonBaseClass{
	
	String CreatedTypologyName;
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
		try
		{
		AutomationFormPage AutomationFormPage=PageFactory.initElements(driver, AutomationFormPage.class);
		waitForPageToLoad(7);
		scroll();
		passTextToWebelement(AutomationFormPage.getfirstNameInput(), ConfigFileReader.getProperty("firstname"));
		waitForPageToLoad(2);
		passTextToWebelement(AutomationFormPage.getLastNameInput(), ConfigFileReader.getProperty("lastname"));
		waitForPageToLoad(2);		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		waitForPageToLoad(2);
		driver.findElement(By.xpath("//input[@value='7']")).click();
		waitForPageToLoad(2);
		driver.findElement(By.xpath("//strong[contains(text(),'Date')]/../..//td[2]/input")).sendKeys(getCurrentDate());
		waitForPageToLoad(2);
		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
		waitForPageToLoad(2);
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		waitForPageToLoad(2);
		driver.findElement(By.xpath("//input[@value='RC']")).click();
		waitForPageToLoad(2);
		driver.findElement(By.xpath("//input[@value='Selenium IDE']")).click();
		waitForPageToLoad(2);
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		waitForPageToLoad(2);
		scroll();
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='continents']")));
		driver.findElement(By.xpath("//select[@name='continents']")).click();
		waitForPageToLoad(2);
		dropdown.selectByVisibleText("South America");
		waitForPageToLoad(2);
		int size = driver.findElements(By.xpath("//select[@name='selenium_commands']/option")).size();
		
		for(int i=0;i<size;i++)
		{
			Thread.sleep(1500);
			scrollIntoView(driver.findElement(By.xpath("(//select[@name='selenium_commands']/option)["+(i+1)+"]")));
			driver.findElement(By.xpath("(//select[@name='selenium_commands']/option)["+(i+1)+"]")).click();;
		}
		waitForPageToLoad(2);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		waitForPageToLoad(4);
		Thread.sleep(5000);
		keyPressEnter();
//		driver.switchTo().alert().accept();
		Thread.sleep(7000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}