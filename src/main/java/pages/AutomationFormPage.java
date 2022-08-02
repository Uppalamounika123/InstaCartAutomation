package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationFormPage {

	
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
}
