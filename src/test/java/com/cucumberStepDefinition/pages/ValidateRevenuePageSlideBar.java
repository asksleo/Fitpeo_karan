package com.cucumberStepDefinition.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;

import static com.fitpeo.StaticTestSession.browserSession;
public class ValidateRevenuePageSlideBar {
    public  WebElement slider_bar;
    public JavascriptExecutor js = (JavascriptExecutor) browserSession.driver;
    @Then("User scroll the page till slide bar is visible")
    public void user_scroll_the_page_till_slide_bar_is_visible() {

        //WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/a"));
        JavascriptExecutor js = (JavascriptExecutor) browserSession.driver;
         // slider_bar= (WebElement) js.executeScript("document.querySelector('.css-sy3s50','after').click();");
          slider_bar= browserSession.driver.findElement(By.xpath("//*[contains(@class,'css-j7qwjs')]/span[1]/span[3]"));

           js.executeScript("argument[0].scrollIntoView(true)",slider_bar);

        }

    @When("User try to slide the bar as requested by  user")
    public void user_try_to_slide_the_bar_as_requested_by_user() {
   Actions act = new Actions(browserSession.driver);
   act.clickAndHold(slider_bar);
   act.moveByOffset(100,500);
   act.build().perform();

    }
    @Then("User should able to adjust the bar")
    public void user_should_able_to_adjust_the_bar() {
       System.out.println("Slided");
    }
    @Then("Value should be updated in text field")
    public void value_should_be_updated_in_text_field() {
        System.out.println("Slided");
       // WebElement slider_box=browserSession.driver.findElement(By.xpath("//div[contains(@class,'css-1s5tg4z']"));
        WebElement text_field= browserSession.driver.findElement(By.xpath("//*[@id=:r0:]']"));
        js.executeScript("argument[0].scrollIntoView(true)",text_field);
        int slider_value=Integer.parseInt(text_field.getAttribute("value"));
        System.out.println(slider_value);

    }

}
