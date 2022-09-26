package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Site_Recode {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "I:\\My Drive\\Eclipse IDE\\Selenium_Maxzen\\lib\\chromedriver_104.0.5112.79.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Index.html");
		
		driver.findElement(By.id("email")).sendKeys("kaushalm797@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		System.out.println("Home page- Done");
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("ABC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Hadapsar,Pune");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234567891");
		Thread.sleep(3000);
		List<WebElement>radiobtn=driver.findElements(By.name("radiooptions"));
		for(WebElement rb:radiobtn)
		{
			if(rb.getAttribute("Value").equalsIgnoreCase("female"))
			{
				if(!rb.isSelected())
				{
					rb.click();
					break;
				}
			}
		}
		List<WebElement>checkbox=driver.findElements(By.id("checkbox1"));
		for(WebElement cb:checkbox)
		{
			if(!cb.isSelected())
			{
				if(cb.getAttribute("Value").equalsIgnoreCase("cricket"))
				{
					cb.click();
					break;
				}
			}
		}
		for(WebElement cb:checkbox)
		{
			if(!cb.isSelected())
			{
				if(cb.getAttribute("Value").equalsIgnoreCase("movie"))
				{
					cb.click();
					break;
				}
			}
		}
//		driver.close();
	}

}
