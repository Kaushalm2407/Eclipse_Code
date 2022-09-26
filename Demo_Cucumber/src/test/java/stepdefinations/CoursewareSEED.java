package stepdefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoursewareSEED {
	WebDriver driver;
	@Given("User is on Courseware login page")
	public void user_is_on_Courseware_login_page() {
		System.setProperty("WebDriver.chorme.driver", "lib/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://courseware.seedinfotech.com");
		   driver.manage().window().maximize();
	}

	@When("User enters the invalid username and password")
	public void user_enters_the_invalid_username_and_password() {
	    driver.findElement(By.name("username")).sendKeys("123456789");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	   
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		 driver.findElement(By.cssSelector("button.login100-form-btn")).click();
	}

	@Then("An error message show on display")
	public void an_error_message_show_on_display() {
	    String acterror=driver.findElement(By.xpath("//p[@class='text-danger text-center']")).getText();
	    String experror=null;
	    assertEquals(acterror, experror);
	    
	}

	@Given("User is on Courseware Login page")
	public void user_is_on_Courseware_Login_page() {
	   
	}

	@When("User enters Valid username and password")
	public void user_enters_Valid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("SI9009562");
	    driver.findElement(By.name("password")).sendKeys("SI90095622846");
	}

	@When("User click in login button")
	public void user_click_in_login_button() {
		driver.findElement(By.cssSelector("button.login100-form-btn")).click();
	}

	@Then("User navigate to login home page")
	public void user_navigate_to_login_home_page() {
		System.out.println("Done!!");
	}


}
