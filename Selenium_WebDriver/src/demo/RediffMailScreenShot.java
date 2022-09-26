package demo;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import utility.WebBrowser;

public class RediffMailScreenShot {

	public static void main(String[] args) {
		WebDriver driver=WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
		String username="Selenium";
		driver.findElement(By.id("login1")).sendKeys("Selenium");
		driver.findElement(By.id("password")).sendKeys("dqojdoajpwe");
		driver.findElement(By.name("proceed")).click();
		
		try {
			boolean flag=WebBrowser.isVisible(driver, By.xpath("//div[@id='div_login_error']/b")).isDisplayed();
			if(flag) {
				
				WebBrowser.takeScreenShot(driver);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}