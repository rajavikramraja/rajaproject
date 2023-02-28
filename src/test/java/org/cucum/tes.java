package org.cucum;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
public class tes extends BaseClass{
	

@Before
public void la() {
	// TODO Auto-generated method stub
LaunchBrowserChrome();
System.out.println("abc");

}
@Before
public void im() {
	// TODO Auto-generated method stub
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	@When("To launch the amazon url")
	public void to_launch_the_amazon_url() {
		LaunchUrl("https://www.amazon.in/");
	}

	@When("To mouse hover hello sign and click the sign in button")
	public void to_mouse_hover_hello_sign_and_click_the_sign_in_button() {
	WebElement findElement = findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	moveTheCursor(findElement);
	findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']")).click();
	}

	@When("To click the create new amazon account")
	public void to_click_the_create_new_amazon_account() {
	findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	}

	@When("To pass the name in first and last name text box")
	public void to_pass_the_name_in_first_and_last_name_text_box(DataTable d) {
		List<String> l = d.asList();
		
	findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(l.get(2));
	}

	@When("To pass the phone number in mobile number in text box")
	public void to_pass_the_phone_number_in_mobile_number_in_text_box(io.cucumber.datatable.DataTable d) {
		List<String> l = d.asList();
		findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys(l.get(1));
	
	}

	@When("To pass the email in email text box")
	public void to_pass_the_email_in_email_text_box(io.cucumber.datatable.DataTable d) {
//		List<List<String>> l = d.asLists();
//		findElement(By.xpath("//input[@id='ap_email']")).sendKeys(l.get(1).get(2));
		System.out.println("ff");
	}

	@When("To pass the password in password text box")
	public void to_pass_the_password_in_password_text_box() {
	findElement(By.xpath("//input[@id='ap_password']")).sendKeys("vikram@123");
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
//	 findElement(By.xpath("//input[@id='continue']")).click();
		System.out.println("hi");
	}

	@Given("To launch url")
	public void toLaunchUrl() {
System.out.println("giv");
	}


	@Then("acs")
	public void acs() {
		System.out.println("123");
	   	}


}
