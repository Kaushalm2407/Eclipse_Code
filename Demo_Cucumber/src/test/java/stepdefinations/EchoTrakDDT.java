package stepdefinations;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.WebBrowser;

public class EchoTrakDDT {
	WebDriver driver;
	@Given("User is on Echo trak home page")
	public void user_is_on_Echo_trak_home_page() {
	    driver=WebBrowser.openBrowser("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	}

//	@When("User enters data as {string} and {string}")
//	public void user_enters_data_and(String username, String password) {
//	   driver.findElement(By.id("txtCustomerID")).sendKeys(username);
//	   driver.findElement(By.id("txtPassword")).sendKeys(password);
//	   driver.findElement(By.id("Butsub")).click();
//	}
//
//	@Then("An {string} is displayed")
//	public void an_is_displayed(String error) {
//	   String acterror=driver.findElement(By.id("lblMsg")).getText();
//	   assertEquals(acterror, error);
//	   driver.close();
//	}
//	@Given("User is on Echotrak Home Page")
//	public void user_is_on_Echotrak_Home_Page() {
//		driver=WebBrowser.openBrowser("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
//	}
//	
//	@When("User enters data")
//	public void user_enters_data(DataTable dataTable) {
//	   List<List<String>> data=dataTable.asLists();
////	   for(int i=0; i<data.size();i++)
////	   {
////		   driver.findElement(By.id("txtCustomerID")).sendKeys(data.get(i).get(0);
////		   driver.findElement(By.id("txtPassword")).sendKeys(data.get(i).get(1));
////		   driver.findElement(By.name("Butsub")).click();
////	   }
//	   for(List<String> dl: data)
//	   {
//		   driver.findElement(By.id("txtCustomerID")).sendKeys(dl.get(0));
//		   driver.findElement(By.id("txtPassword")).sendKeys(dl.get(1));
//		   driver.findElement(By.name("Butsub")).click();
//		   driver.findElement(By.id("txtCustomerID")).clear();
//		   driver.findElement(By.id("txtPassword")).clear();
//	   }
//	}
//
//	@Then("User is logged in")
//	public void user_is_logged_in() {
//	  System.out.println("Login successful");
//	}

//	@When("User enters data")
//	public void user_enters_data(DataTable dataTable) {
//		List<Map<String, String>> data=dataTable.asMaps();
//		for(Map<String, String> dm:data)
//		{
//			driver.findElement(By.id("txtCustomerID")).sendKeys(dm.get("username"));
//			   driver.findElement(By.id("txtPassword")).sendKeys(dm.get("password"));
//			   driver.findElement(By.name("Butsub")).click();
//			   driver.findElement(By.id("txtCustomerID")).clear();
//			   driver.findElement(By.id("txtPassword")).clear();
//		}
//	}
	
	@When("User navigate to Employee Login page")
	public void user_navigate_to_Employee_Login_page() {
	    driver.findElement(By.id("lbEmplogin")).click();
	}
	
	@And ("User enters data")
	public void User_enters_data(DataTable dataTable) {
		List<Map<String, String>> data=dataTable.asMaps();
		for(Map<String, String> dm:data)
		{
		driver.findElement(By.id("ctl00_contentPlaceHolder_txtCustomerID")).sendKeys(dm.get("username"));
		driver.findElement(By.id("ctl00_contentPlaceHolder_txtPassword")).sendKeys(dm.get("password"));
		driver.findElement(By.name("ctl00$contentPlaceHolder$Butsub")).click();
		driver.findElement(By.id("ctl00_contentPlaceHolder_txtCustomerID")).clear();
		driver.findElement(By.id("ctl00_contentPlaceHolder_txtPassword")).clear();
		}
	}

	@Then("User is logged in")
	public void user_is_logged_in() {
	  System.out.println("Login successful");
	}

}
