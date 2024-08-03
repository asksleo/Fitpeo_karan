package com.cucumberStepDefinition.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.fitpeo.StaticTestSession.browserSession;

public class ValidateRevenuePageTextField {
    public JavascriptExecutor js = (JavascriptExecutor) browserSession.driver;
    public WebElement text_field;
    public  WebElement slider_bar;
    @When("User try to enter the value in text field as requested by  user")
    public void user_try_to_enter_the_value_in_the_text_field_as_requested_by_user() {
         text_field= browserSession.driver.findElement(By.xpath("//*[@id=:r0:]']"));
        js.executeScript("argument[0].scrollIntoView(true)",text_field);
    }
    @Then("User should able to update the field")
    public void user_should_able_to_update_the_field() {
        Actions act = new Actions(browserSession.driver);
        act.sendKeys("546");
        act.build().perform();

    }
    @Then("Value slider should be adjusted according to the text field value")
    public void value_slider_should_be_adjusted_according_to_the_text_field_value() {
        slider_bar= browserSession.driver.findElement(By.xpath("//*[contains(@class,'css-j7qwjs')]/span[1]/span[3]"));
int slider_value=Integer.parseInt(slider_bar.getAttribute("value"));
System.out.println(slider_value);
    }

}
