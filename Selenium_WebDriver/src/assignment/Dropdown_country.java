package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.WebBrowser;

public class Dropdown_country {

	public static void main(String[] args) {
		boolean flag=false;
		WebDriver driver =WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
		WebElement country= driver.findElement(By.id("countries"));
		Select ddcountry=new Select(country);
		List<WebElement> options=ddcountry.getOptions();
		for(WebElement option : options)
		{
			if(option.getAttribute("value").equals("india"))
			{
				flag=true;
				ddcountry.selectByValue("india");
				break;
				
			}
		}
		if(flag==false)
			System.out.println("Incorrect option given");
		
		for(WebElement option:options)
		{
			if(option.getText().equals("Australia"))
			{
				flag=true;
				ddcountry.selectByVisibleText("Australia");
				break;
			}
		}
		
	}

}
