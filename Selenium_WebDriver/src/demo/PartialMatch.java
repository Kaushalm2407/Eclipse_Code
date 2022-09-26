package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class PartialMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= WebBrowser.openBrowser("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement fullname=driver.findElement(By.cssSelector("input[name^=name]"));
		fullname.sendKeys("kaushal mishra");
		WebElement rediffmailid = driver.findElement(By.cssSelector("input[name^=login]"));
		rediffmailid.sendKeys("kaushalm797");
		

	}

}
