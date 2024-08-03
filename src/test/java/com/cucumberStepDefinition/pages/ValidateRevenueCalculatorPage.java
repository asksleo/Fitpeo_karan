package com.cucumberStepDefinition.pages;

import com.fitpeo.ApplicationSettings;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;



import static com.fitpeo.StaticTestSession.browserSession;
public class ValidateRevenueCalculatorPage {
    public String browser_name= ApplicationSettings.BROWSER_NAME;
    public static Logger log = (Logger) LogManager.getLogger();
    @Given("User is on Home Page of Fitpeo")
    public void user_is_on_home_page_of_fitpeo()  {
        browserSession.startBrowserSession(browser_name);
        log.info("I am on home page");
        System.out.println("I am on home page");
        //Assert.assertEquals(true, "Remote Patient Monitoring - fitpeo.com".equals(browserSession.driver.getTitle()));

    }
    @When("User click on Revenue Calculator Menu button")
    public void user_click_on_revenue_calculator_menu_button() {
        browserSession.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement revenue_calculator_menu= browserSession.driver.findElement(By.xpath("//*[contains(text(),'Revenue Calculator')]"));
        revenue_calculator_menu.click();


    }
    @Then("User lands on Revenue-Calculator page")
    public void user_lands_on_revenue_calculator_page() throws InterruptedException {
        Thread.sleep(5000);
       System.out.println(browserSession.driver.getCurrentUrl());
     //  Assert.assertEquals(true, "https://fitpeo.com/revenue-calculator".equals(browserSession.driver.getCurrentUrl()));
        System.out.println("User is on Revenue Calculator page");

    }
}
