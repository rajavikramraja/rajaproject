package org.ma;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import io.cucumber.datatable.DataTable;

import org.openqa.selenium.By;

import base.BaseClass;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class one extends BaseClass{
	@Before
	public void bro() {
		// TODO Auto-generated method stub
LaunchBrowserChrome();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Given("To launch the url")
	public void to_launch_the_url() {
	LaunchUrl("https://www.facebook.com/"); 
	}

	@When("To pass email in email field text box")
	public void to_pass_email_in_email_field_text_box(DataTable d) {
		Map<String, String> m = d.asMap(String.class,String.class);
	findElement(By.xpath("//input[@id='email']")).sendKeys(m.get("1"));
	}

	@When("To pass password in password field text box")
	public void to_pass_password_in_password_field_text_box(DataTable d) {
	 	List<Map<String, String>> m = d.asMaps(String.class, String.class);
	findElement(By.xpath("//input[@id='pass']")).sendKeys( m.get(1).get("c")); 	
	}
	// TODO Auto-generated constructor stub

	@Then("check the status")
	public void check_the_status() {
	}



}
