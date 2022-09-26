package stepdefinations;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon {
	WebDriver driver;
	@Given("User is on Amazon home page")
	public void user_is_on_Amazon_home_page() {
		 System.setProperty("WebDriver.chorme.driver", "lib/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://www.amazon.in");
		   driver.manage().window().maximize();
	}

	@When("User search for {string}")
	public void user_search_for(String product) {
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	   driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("Result for {string} are displayed")
	public void result_for_are_displayed(String product) {
	   String title=driver.getTitle();
	   assertTrue(title.contains(product));
	}
	@When("User sorts by {string}")
	public void user_sorts_by(String criteria) {
	   driver.findElement(By.className("a-button-inner")).click();
	   List<WebElement> sortcriteria=driver.findElements(By.cssSelector("div[class='a-popover-inner']>ul>li>a"));
	   for(WebElement sc:sortcriteria)
	   {
		   if(sc.getText().equals(criteria));
		   sc.click();
		   break;  
	   }
	}

	@Then("Result are sorted")
	public void result_are_sorted() {
	    System.out.println("Done");
	}

	@When("User Filters by {string}")
	public void user_Filters_by(String string) {
		 System.out.println("Done");
	}

	@Then("Results are filtered")
	public void results_are_filtered() {
		 System.out.println("Done");
	}

}
