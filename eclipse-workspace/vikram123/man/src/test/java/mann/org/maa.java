package mann.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.bytebuddy.asm.Advice.AllArguments;

public class maa extends BaseClass {
	static WebDriver driver;
	WebDriverWait wait;
	
	@Given("The user enters the testing site.")
	public void the_user_enters_the_testing_site() {
		LaunchBrowserChrome();
//		wait =new WebDriverWait(driver, 10);
		windowMaximize();
		LaunchUrl("https://www.scentarts.ae/");
		implict();
		
	   	}

	@Given("click the About Us button.")
	public void click_the_About_Us_button() {
		implict();
		findElement(By.xpath("(//a[normalize-space()='About Us'])[3]")).click();
	       
	}




	@Then("scroll down and see the “Download Brochure \\(English)”")
	public void scroll_down_and_see_the_Download_Brochure_English() {
		implict();
		findElement(By.xpath("//a[normalize-space()='Download Brochure (ENGLISH)']")).click();
	  }

	@Then("check the Brochure is downloaded.")
	public void check_the_Brochure_is_downloaded() {
		implict();
//		findElement(By.xpath("//a[normalize-space()='Download Brochure (ENGLISH)']")).click();
	System.out.println("brochure open");  
	}

	@Given("click the “Products” button.")
	public void click_the_Products_button() {
implict();
		WebElement aa = findElement(By.xpath("(//a[normalize-space()='Products'])[3]"));
	moveTheCursor(aa);
	}

	@Then("mouse hover the “Products” button again hovers the “Aroma Oil”")
	public void mouse_hover_the_Products_button_again_hovers_the_Aroma_Oil() {
	implict();
		WebElement cc = findElement(By.xpath("(//a[normalize-space()='Aroma Oil'])[3]")); 
	moveTheCursor(cc);
	}

	@Then("select the “Sweet”")
	public void select_the_Sweet() {
	  implict();
//	WebElement fi = findElement(By.linkText("Sweet"));
	  WebElement fi = findElement(By.xpath("(//a[normalize-space()='Sweet'])[3]"));
//	
//	JavascriptExecutor js =(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].click();", fi);
//	  WebElement until = wait.until(ExpectedConditions.visibilityOf(fi));
	fi.click();
	}
	

	@Then("Users can see the “Harmony” and choose the oil.")
	public void users_can_see_the_Harmony_and_choose_the_oil() {
	implict();
		findElement(By.xpath("//img[@src='https://scentarts.ae/uploads/Harmony .jpg']")).click();
		
	  }

	@Then("select the volume “{int}ml” and add quality “{int}”")
	public void select_the_volume_ml_and_add_quality(Integer int1, Integer int2) {
	  implict();
		findElement(By.xpath("//span[normalize-space()='Choose an option']")).click();
	  findElement(By.xpath("//input[@type='text']")).sendKeys("1000ml",Keys.ENTER);
	WebElement cc = findElement(By.xpath("//input[@title='Qty']"));
	doubleClick(cc);
	}

	@Then("click “Add To Cart”")
	public void click_Add_To_Cart() {
		implict();
		findElement(By.xpath("//button[@type='submit']")).click();
	  }

	@Then("click the “Process To Checkout”")
	public void click_the_Process_To_Checkout() {
	findElement(By.xpath("//a[@class='button btn-primary medium checkout-button']")).click(); 
	}

	@Then("mouse hover the “Products” button and clicks the “Car Diffusers”")
	public void mouse_hover_the_Products_button_and_clicks_the_Car_Diffusers() {
	findElement(By.xpath("//li[@class='menu-item-has-children show-submenu']//ul[@class='sub-menu']//li//a[normalize-space()='Car Diffusers']")).click(); 
	}




}
