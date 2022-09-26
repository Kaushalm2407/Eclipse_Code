package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTittle_amezon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("books");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String title=driver.getTitle();
		if(title.equals("Amazon.in : books"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
	}

}
