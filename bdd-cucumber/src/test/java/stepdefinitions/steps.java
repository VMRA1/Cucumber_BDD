package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class steps {
	WebDriver driver;
	@Given("I am on Login page")
	public void i_am_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		String url="https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnushaAM\\Downloads\\chromewebdriver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		  driver.findElement(By.id("txtUsername")).sendKeys(string);
	    
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
		 driver.findElement(By.id("txtPassword")).sendKeys(string);
	    
	}

	@When("I click on Submit button")
	public void i_click_on_submit_button() throws InterruptedException {
		 driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(10);
	    
	}

	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
		  String name=driver.findElement(By.id("welcome")).getText();
		    String Actual=string;
//		    Assert.assertEquals(name, Actual);
		    Assert.assertTrue(name.contains(string));
		    System.out.println("Login successful");
		    Thread.sleep(10);
		    driver.close();
	    
	}

	@Then("I should see error message as {string}")
	public void i_should_see_error_message_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		String expectedMsg="Invalid credentials";
		String actu=driver.findElement(By.id("spanMessage")).getText();
		  Assert.assertEquals(string, actu);
		    System.out.println("Error as expected");
		    Thread.sleep(10);
		    driver.close();
		
	    
	}


}
