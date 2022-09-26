package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Rediff_ForgotPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver=WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.linkText("Forgot Password?")).click();
		WebElement emailId=driver.findElement(By.id("txtlogin"));
		emailId.sendKeys("kaushalm797");
		driver.findElement(By.name("next")).click();
//		driver.close();
		}

}
