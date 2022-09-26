package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_DemoSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Kaushal");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Mishra");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Hadapsar, Pune");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("kaushalm797@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9690332846");
		driver.findElement(By.xpath("//input[@name='radiooptions'][@value='Male']")).click();
		
		Select dropdown=new Select(driver.findElement(By.id("Skills")));
		dropdown.selectByValue("Certifications");
		
	}

}
