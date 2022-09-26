package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;

public class ScreenShot_Radiffmail {

	public static void main(String[] args) {
		
		WebDriver driver=WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Selenium");
		driver.findElement(By.id("password")).sendKeys("uuenjdsn");
		driver.findElement(By.name("proceed")).click();
		
		try {
			
		}
		catch(Exception e) {
			
		}
		}

	}


