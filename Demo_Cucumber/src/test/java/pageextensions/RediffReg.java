package pageextensions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffReg {
	@FindBy(css="input[name^='name']")
	WebElement txtname;
	@FindBy(css="input[name^='login']")
	WebElement txtemail;
	@FindBy(css="input[name^='gender']")
	List<WebElement> rbgender;
	@FindBy(id="country")
	WebElement lstcountry;
	
	public RediffReg(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void register(String name, String email, String gender, String country)
	{
		txtname.sendKeys(name);
		txtemail.sendKeys(email);
		for(WebElement rb : rbgender)
		{
			if(rb.getAttribute("value").equals(gender))
			{
				rb.click();
				break;
			}
		}
		Select ddcountry= new Select(lstcountry);
		List<WebElement> options = ddcountry.getOptions();
		for(WebElement op : options)
		{
			if(op.getText().equals(country))
			{
				ddcountry.selectByVisibleText(country);
				break;
			}
		}
	}

}