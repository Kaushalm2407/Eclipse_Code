package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EchoTrak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		WebElement username=driver.findElement(By.id("txtCustomerID"));
		username.sendKeys("admin123");
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin@123");
		driver.findElement(By.id("Butsub")).click();
	}

}
