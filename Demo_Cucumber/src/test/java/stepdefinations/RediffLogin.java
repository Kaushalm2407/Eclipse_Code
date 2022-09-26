package stepdefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RediffLogin {
	WebDriver driver;
	@Given("user is on rediffmail home page")
	public void user_is_on_rediffmail_home_page() {
	   System.setProperty("WebDriver.chorme.driver", "lib/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	   driver.manage().window().maximize();
	}
	

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    driver.findElement(By.id("login1")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("admin@123");
	}

	@When("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	   driver.findElement(By.name("proceed")).click();
	}

	@Then("user is navigate to the inbox page")
	public void user_is_navigate_to_the_inbox_page() {
	   System.out.println("Done!!");
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	  driver.findElement(By.id("login1")).sendKeys("guest");
	  driver.findElement(By.id("password")).sendKeys("guest@123");
	}

	@Then("An error is displayed")
	public void an_error_is_displayed() {
	   String acterror=driver.findElement(By.cssSelector("div#div_login_error>b")).getText();
	   String experror = null;
	assertEquals(acterror, experror);
	   driver.close();
	}
	

}
