package org.cu;

import org.openqa.selenium.By;

import base.BaseClass;
import cucumber.api.java.en.When;

public class mtes extends BaseClass {
	@When("User has to hit the flipcart url")
	public void user_has_to_hit_the_flipcart_url() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		LaunchUrl("https://www.flipkart.com/");
		findElement(By.xpath("//button[.='✕']")).click();

	}

	@When("User has to pass the data {string} in search field")
	public void user_has_to_pass_the_data_in_search_field(String pr) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(pr);
	}

	@When("User has to click the search button")
	public void user_has_to_click_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
	}



}
