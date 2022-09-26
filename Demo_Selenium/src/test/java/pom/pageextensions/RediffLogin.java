package pom.pageextensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLogin {
	//variable declearation
	@FindBy(id="login1")
	WebElement txtusername;
	@FindBy(id="password")
	WebElement txtpassword;
	@FindBy(name="proceed")
	WebElement btnlogin;
	@FindBy(linkText="Create a new account")
	WebElement lnkcreateaccount;
	@FindBy(css="div#div_login_error>b")
	WebElement lblerror;
	
	//constructor
	public RediffLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//WebElement txtusername=driver.findElement(By.id("login1"));
	}
	//Method
	public void login(String username,String password)
	{
		txtusername.sendKeys(username);
		txtpassword.sendKeys(password);
		btnlogin.click();
	}
	public String getError()
	{
		return lblerror.getText();
	}
	public void navigateToRegistration()
	{
		lnkcreateaccount.click();
	}
	public void clearData()
	{
		txtusername.clear();
		txtpassword.clear();
	}
}
