package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.WebBrowser;
import utility.WebElementMethods;

public class Syncronization {

	public static void main(String[] args) {
		
		WebDriver driver=WebBrowser.openBrowser("https:/www.google.com");
		WebElementMethods.entertext(driver, By.name("q"), "a");
		try {
			WebElementMethods.clickElement(driver, By.cssSelector("div.pcTkSc>div>span"));
		}
		catch(ElementNotInteractableException e)
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.pcTkSc>div>span")));
			WebElementMethods.clickElement(driver, By.cssSelector("div.pcTkSc>div>span"));
		}
	}

}
