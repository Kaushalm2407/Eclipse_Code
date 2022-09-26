package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Family {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","lib//chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.familycarecircle.com/main/index.html");
		driver.findElement(By.linkText("Login")).click();
		String u=driver.getTitle();
//		System.out.println(u);
		if(u.equals("Family Care Circle"))
		{
			System.out.println("Login Page Open");
		}
		else {
			System.out.println("Login Page not Open");
		}
		driver.findElement(By.id("email")).sendKeys("kaushalm797@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.id("loginButton")).click();
		String l=driver.getCurrentUrl();
		if(l.equals("http://www.familycarecircle.com/home"))
		{
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Failed");
		}
		driver.close();
	}
}
