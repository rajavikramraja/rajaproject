package org.inte;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicTreeUI.TreePageAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.GetCurrentWindowHandle;
import org.seleniumhq.jetty9.util.log.Log;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cha10 extends BaseClass {
	public static String windowHandl;
	@Given("To launch browser")
	public void to_launch_browser() {
		LaunchBrowserChrome();
		windowMaximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }

	@When("To launch url to myntra application")
	public void to_launch_url_to_myntra_application() {
	    LaunchUrl("https://www.myntra.com/");
	    }

	@When("To search Tshirt")
	public void to_search_Tshirt() throws InterruptedException {
	    findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Tshirt",Keys.ENTER);
	   Thread.sleep(3000);
	   	}

	@When("select first product and select  size")
	public void select_first_product_and_select_size() {
		
		findElement(By.xpath("(//img[@title='Huetrap Men Beige & Black Typography Printed Sustainable T-shirt'])[1]")).click();
		 windowHandl = driver.getWindowHandle();
		System.out.println ( windowHandl);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String winid : windowHandles) {
			if (winid!=windowHandl) {
				driver.switchTo().window(winid);
				
			}
		}

//		 Alert ac = driver.switchTo().alert();
//			ac.dismiss();
		
			
		findElement(By.xpath("(//button[@class='size-buttons-size-button size-buttons-size-button-default'])[2]")).click();
		
	}

	@When("Click the add to bag")
	public void click_the_add_to_bag() {
		findElement(By.xpath("//body/div[@id='mountRoot']/div/div/main[@class='pdp-pdp-container']/div[@class='pdp-details common-clearfix']/div[@class='pdp-description-container']/div/div[1]/div[1]/div[1]")).click();
	        
	}

	@When("close the tab")
	public void close_the_tab() {
	System.out.println("hi"); 
	driver.close();
	
	}

	@Then("Click bag icon and Screenshot")
	public void click_bag_icon_and_Screenshot() throws InterruptedException, IOException {
		System.out.println("hi");
		Thread.sleep(3000);
try {
	@SuppressWarnings("unchecked")
	String windowHan =  driver.getWindowHandle();
	driver.switchTo().window(windowHan);
} catch (Exception e) {
	
	// TODO: handle exception
	System.out.println("window handle");
}
		
		 findElement(By.xpath("(//a[text()='Beauty'])[1]")).click();
		 
			findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
	
	screenShot("C:\\Users\\vikra\\eclipse-workspace\\vikram123\\org.inte\\sc\\mg.png");
	
	}



}
