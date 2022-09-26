package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_Radiffmail {

	public static void main(String[] args) {
		
		Boolean flag=false;
		System.setProperty("webdriver.chrome.driver","I:\\My Drive\\Automation Testing\\Selenium_WebDriver\\lib\\ChromeDriver_103.0.5060.53.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement fullname=driver.findElement(By.cssSelector("input[name^=name]"));
		fullname.sendKeys("Kaushal");
		WebElement rediffId=driver.findElement(By.cssSelector("input[name^=login]"));
		rediffId.sendKeys("kaushalm797");
		driver.findElement(By.cssSelector("input[name^=btnchkavail]")).click();
		WebElement password=driver.findElement(By.cssSelector("input[name^=passwd]"));
		password.sendKeys("Admin@123");
		WebElement retypepassword=driver.findElement(By.cssSelector("input[name^=confirm_passwd]"));
		retypepassword.sendKeys("Admin@123");
		WebElement alternateId=driver.findElement(By.cssSelector("input[name^=altemail]"));
		alternateId.sendKeys("admin123@gmail.com");
		WebElement mobile=driver.findElement(By.id("mobno"));
		mobile.sendKeys("9690332846");
		WebElement day=driver.findElement(By.cssSelector("select[name^='DOB_Day']"));
		Select ddday=new Select(day);
		List<WebElement> options=ddday.getOptions();
		for(WebElement option:options)
		{
			if(option.getAttribute("value").equals("13"));
			{
				flag=true;
				ddday.selectByValue("13");
				break;
			}
		}
		if(flag==false)
			System.out.println("Incorrect option given: " +ddday);
		WebElement month=driver.findElement(By.cssSelector("select[name^='DOB_Month']"));
		Select ddmonth=new Select(month);
		
		
	}

}
