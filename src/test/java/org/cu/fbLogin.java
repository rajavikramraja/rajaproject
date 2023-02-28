package org.cu;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class fbLogin extends BaseClass {
	
	@Given("To lauch the chrome browser and maximize window")
	public void to_lauch_the_chrome_browser_and_maximize_window() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	    LaunchBrowserChrome();
	    windowMaximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}


	@When("To lauch the url of flipkart application")
	public void to_lauch_the_url_of_flipkart_application() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		LaunchUrl("https://www.flipkart.com/");
		findElement(By.xpath("//button[.='✕']")).click();
	}

	@When("To pass product in search field")
	public void to_pass_product_in_search_field() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 14 pro");
	}

	@When("To click the search button")
	public void to_click_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
	}

	@When("To select the iphone pro product")
	public void to_select_the_iphone_pro_product() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	findElement(By.xpath("//div[normalize-space()='APPLE iPhone 14 Pro (Deep Purple, 128 GB)']")).click();
	}

	@When("To handle the windows")
	public void to_handle_the_windows() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		windowshandle();
	}

	@When("To select the buy now button")
	public void to_select_the_buy_now_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	findElement(By.xpath("//button[@type='button']")).click();
	}

	@Then("To close the browser")
	public void to_close_the_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		Thread.sleep(9000);
		closeEntireBrowser();
	}



}
