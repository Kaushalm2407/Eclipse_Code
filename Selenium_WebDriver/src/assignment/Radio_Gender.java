package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class Radio_Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
		List<WebElement> gender=driver.findElements(By.name("radiooptions"));
		
		for(WebElement gndr:gender)
		{
			if(gndr.getAttribute("value").equalsIgnoreCase("Male"))
			{
				gndr.click();
				System.out.println("Clicked");
			}
		}
	}

}
