package com.cucumberStepDefinition.pages;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginFunctionality {
	ChromeDriver driver;
	@Given("I am on login page of the application")
	public void i_am_on_login_page_of_the_application() {
		WebDriverManager.chromiumdriver().setup();
		driver= new ChromeDriver();
			driver.get("https://qa.papajohns.com");
	    
	}

	@When("I enter the username and password")
	public void i_enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<Map<String,String>> ls=dataTable.asMaps(String.class,String.class);
	    for(int i=0;i<2;i++) {
	    	
	    	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	    	//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//div[@id='navigation-mobile']/ul/li[2]/a"))));
	    	driver.findElement(By.xpath("//*[@class='nav-container']/ul/li[4]/a")).click();
	    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("header-account-sign-in-email"))));
	    	driver.findElement(By.id("header-account-sign-in-email")).sendKeys(ls.get(i).get("username"));
	    	driver.findElement(By.id("header-account-sign-in-password")).sendKeys(ls.get(i).get("password"));
	    	
	    	
	    }
	}

	@Then("I am on login page")
	public void i_am_on_login_page() {
	    System.out.println("I am on home page");
	}


}
