package artOfTesting.test;

import java.util.concurrent.TimeUnit;

import artOfTesting.page.GooglePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googleCalcStepDefinition {
	
	
	protected WebDriver driver;
	private GooglePage googlePage;
	
	 @Before
	    public void setup() {
	        driver = new FirefoxDriver();
	}
		
	@Given("^I open google$")
	public void I_open_google() {
		//Set implicit wait of 5 seconds and launch google
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		googlePage = new GooglePage(driver);

	}
	
	@When("^I enter \"([^\"]*)\" in search textbox$")
	public void I_enter_in_search_textbox(String additionTerms) {
	    googlePage.enterTextIntoTextBox(additionTerms);
	}
	
	@Then("^I should get result as \"([^\"]*)\"$")
	public void I_should_get_correct_result(String expectedResult) {
		String result = googlePage.getResultFromCalculator();
				
		//Verify that result of 2+2 is 4
		Assert.assertEquals(result, expectedResult);
	}
	
	 @After
	    public void closeBrowser() {
		 driver.close();
		 driver.quit();
	 }

}


