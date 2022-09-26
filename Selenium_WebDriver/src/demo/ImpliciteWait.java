package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// get(String arg0) load new webpage in current browser window
		driver.get("https://www.naukri.com/");
		
		//driver.manage() returns Option interface inside option interface there is method 
		//timeouts() which return Timeouts interface 
		//in Timeouts interface there is method implicitlyWait(time in long, TimeUnit);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {			
			driver.findElement(By.xpath("//span[@id='block']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
