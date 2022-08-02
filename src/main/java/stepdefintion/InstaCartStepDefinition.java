package stepdefintion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.InstaCartPage;
import cucumber.api.java.en.Then;

import org.openqa.selenium.support.PageFactory;

import common.CommonBaseClass;
import common.ConfigFileReader;

public class InstaCartStepDefinition extends CommonBaseClass {
	
	InstaCartPage InstaCartPage=PageFactory.initElements(driver, InstaCartPage.class); 
	
  @Given("^I open the browser and load the instamart url$")
  public void given() throws Throwable {
	  
	  setup();
	  openURL(ConfigFileReader.getProperty("baseURL"));
  }

  @When("^I scroll to common question$")
  public void when() throws Throwable {
	  
	  waitForPageToLoad(7);
	  scroll();
	  scroll();
	  scroll();
  }

  @Then("^click each question and print the question and answer$")
  public void then() throws Throwable {
	  InstaCartPage.getQuestionAndAnswers();
  }


}
