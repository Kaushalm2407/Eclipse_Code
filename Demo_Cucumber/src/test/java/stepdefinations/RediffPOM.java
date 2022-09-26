package stepdefinations;
import pageextensions.RediffLogin;
import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageextensions.RediffReg;

public class RediffPOM {
	WebDriver driver;
	RediffLogin rlogin;
	RediffReg rreg;
	
	/*
	 * Hooks are executed as 
	 * Before Hook is executed before each scenario
	 * After Hook is executed after each scenario
	 * To manage when hooks should be executed one can tagged hooks
	 * A tagged hook is executed before/after a scenario mentioned by the tag
	 * One can have multiple hooks/ tagged hooks
	 */
	@Before //("@sce1")
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		rlogin= new RediffLogin(driver);
		rreg= new RediffReg(driver);
	}
	@Given("User is on Rediff Home Page")
	public void user_is_on_Rediff_Home_Page() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("User logs in as {string} and {string}")
	public void user_logs_in_as_and(String username, String password) {
		rlogin.login(username, password);
	}

	@When("User clicks on login Button")
	public void user_clicks_on_login_Button() {
	   System.out.println("Done");
	}

	@Then("User is navigated to the mail page")
	public void user_is_navigated_to_the_mail_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("An error message {string} is displayed on login page")
	public void an_error_message_is_displayed_on_login_page(String experror) {
	   String acterror=rlogin.getError();
	   assertEquals(acterror, experror);
	}

	@Given("User is on Rediff home page")
	public void user_is_on_Rediff_home_page() {
	   rlogin.navigateToRegistration();
	}
	@Given("User navigated to the registration page")
	public void user_navigated_to_the_registration_page() {
		rlogin.navigateToRegistration();
	}
	@When("User enterd following data")
	public void user_enterd_following_data(DataTable dataTable) {
	   Map<String, String> data=dataTable.asMap(String.class, String.class);
	   rreg.register(data.get("name"), data.get("email"), data.get("gender"), data.get("country"));
	}

	@Then("User is registered Successfully")
	public void user_is_registered_Successfully() {
	    System.out.println("Done");
	}
	
	@After //("sce10")
	public void tearDown()
	{
		driver.close();
	}

}
