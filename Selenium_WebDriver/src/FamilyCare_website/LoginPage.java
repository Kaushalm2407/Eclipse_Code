package FamilyCare_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.familycarecircle.com/login");
		driver.findElement(By.id("email")).sendKeys("kaushalm797@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		String homeUrl=driver.getCurrentUrl();
		if(homeUrl.equals("http://www.familycarecircle.com/home"))
		{
			System.out.println("Login Successful");
		}
		else 
		{
			System.out.println("Login Failed");
		}
		driver.close();
	}

}
