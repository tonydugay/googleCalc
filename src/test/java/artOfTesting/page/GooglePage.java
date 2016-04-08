package artOfTesting.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by tony on 07/04/16.
 */
public class GooglePage {


    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.google.co.in");

    }

    public WebElement getGoogleTextBox() {
        return driver.findElement(By.id("lst-ib"));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.name("btnG"));
    }

    public void enterTextIntoTextBox(String theText) {
        //Write term in google textbox
        getGoogleTextBox().sendKeys(theText);

        //Click on searchButton
        getSearchButton().click();
    }

    public String getResultFromCalculator() {

        //Get result from calculator
        return driver.findElement(By.id("cwos")).getText();
    }



}
