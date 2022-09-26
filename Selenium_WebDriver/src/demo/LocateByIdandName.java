package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByIdandName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement username=driver.findElement(By.id("login1"));
		username.sendKeys("admin123");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("admin@123");
		driver.findElement(By.name("proceed")).click();

	}

}
