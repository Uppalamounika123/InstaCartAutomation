package pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import common.CommonBaseClass;

public class InstaCartPage extends CommonBaseClass{

	
	@FindBy(how = How.XPATH, using = "//input[@name='firstname']")
    private WebElement firstNameInput;
	
	public WebElement getfirstNameInput() {
		return firstNameInput;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='lastname']")
    private WebElement LastNameInput;
	
	public WebElement getLastNameInput() {
		return LastNameInput;
	}
	
	public void getQuestionAndAnswers() throws Exception
	{
		int sizeOfQuestions =  driver.findElements(By.xpath("//*[text()='Common questions']/../div/div")).size();
		System.out.println("size");
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i =1 ;i<=sizeOfQuestions; i++)
		{
			scroll();
			waitForPageToLoad(7);
			String Question = driver.findElement(By.xpath("(//*[text()='Common questions']/../div/div//button)["+i+"]")).getText();
			driver.findElement(By.xpath("(//*[text()='Common questions']/../div/div//button)["+i+"]")).click();
			Thread.sleep(2000);
			String Answer = driver.findElement(By.xpath("(//*[text()='Common questions']/../div/div/div)["+i+"]")).getText();
			driver.findElement(By.xpath("(//*[text()='Common questions']/../div/div//button)["+i+"]")).click();
			map.put(Question, Answer);
			System.out.println(Question);
			System.out.println();
			System.out.println();
			System.out.println(Answer);
		}
	}
}
