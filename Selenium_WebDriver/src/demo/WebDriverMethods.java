package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","lib//chromedriver.exe");
//	Create an object of ChromeBrowser-new instance of a browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();

}
}
