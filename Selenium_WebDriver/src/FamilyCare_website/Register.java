package FamilyCare_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;
import utility.WebElementMethods;

public class Register {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=WebBrowser.openBrowser("http://www.familycarecircle.com/login");
		driver.findElement(By.linkText("Register Now")).click();
		Thread.sleep(2000);
		WebElement u=driver.findElement(By.cssSelector("input.jss8"));
		if(!u.isSelected())
		{
			u.click();
			System.out.println("T&C Accepted");
		}
		driver.findElement(By.cssSelector("span.MuiButton-label")).click();
		Thread.sleep(2000);
		String cu=driver.getCurrentUrl();
		if(cu.equals("http://www.familycarecircle.com/creataccount"))
		{
			System.out.println("Create Account Page Opened");
		}
		else {
			System.out.println("Create Account Page not Opened");
		}
		//For Cancel
//		driver.findElement(By.cssSelector("span.MuiButton-label")).click();
//		Thread.sleep(3000);
//		System.out.println("Canceled");
		
		driver.close();
//		System.out.println("Closed Successfully");
		

	}

}
