package com.cucumberStepDefinition.pages;

import static com.fitpeo.StaticTestSession.browserSession;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.fitpeo.ApplicationSettings;


public class FitPeoFunctionalTest {
	
	 public String browser_name= ApplicationSettings.BROWSER_NAME;
	    public static Logger log = (Logger) LogManager.getLogger();
	    
	    @Test
	    public void user_is_on_home_page_of_fitpeo()  {
	        browserSession.startBrowserSession(browser_name);
	        log.info("I am on home page");
	        
	        //Assert.assertEquals(true, "Remote Patient Monitoring - fitpeo.com".equals(browserSession.driver.getTitle()));

	    }
	    @Test
	    public void user_click_on_revenue_calculator_menu_button() {
	        
	        WebElement revenue_calculator_menu= browserSession.driver.findElement(By.xpath("//*[contains(text(),'Revenue Calculator')]"));
	        revenue_calculator_menu.click();


	    }
	    @Test
	    public void user_lands_on_revenue_calculator_page() throws InterruptedException {
	        Thread.sleep(5000);
	       System.out.println(browserSession.driver.getCurrentUrl());
	     //  Assert.assertEquals(true, "https://fitpeo.com/revenue-calculator".equals(browserSession.driver.getCurrentUrl()));
	        System.out.println("User is on Revenue Calculator page");


}}
