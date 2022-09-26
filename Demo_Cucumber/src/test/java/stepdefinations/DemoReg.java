package stepdefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.WebBrowser;

public class DemoReg {
	WebDriver driver;
	
	@Given("User is on demoqa registration page")
	public void user_is_on_demoqa_registration_page() {
	   driver=WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
	}

	@When("User enters registration data")
	public void user_enters_registration_data(DataTable datatable) {
	   Map<String,String> data=datatable.asMap(String.class, String.class);
	   driver.findElement(By.cssSelector("input[ng-model='FirstName']")).sendKeys(data.get("name"));
	   driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys(data.get("email"));
	   driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys(data.get("phone"));
	   List<WebElement> radios=driver.findElements(By.name("radiooptions"));
	   for(WebElement rb:radios)
	   {
		   if(rb.getAttribute("value").equals(data.get("gender")))
			{
			   rb.click();
			   break;
			}
	   }
	}

	@Then("User is registered")
	public void user_is_registered() {
	    System.out.println("Done");
	    driver.close();
	}

}
