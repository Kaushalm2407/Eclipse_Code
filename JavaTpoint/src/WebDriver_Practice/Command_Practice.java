package WebDriver_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Command_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "I:\\My Drive\\Drivers\\Chrome-driver\\ChromeDriver_103.0.5060.53.exe");
		WebDriver driver=new ChromeDriver();
		
//		Fetching Web Page
		driver.get("http://www.google.com/");
//		driver.navigate().to("http://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		
//		Locating forms and sending user inputs
		driver.findElement(By.name("q")).sendKeys("epfo");
		Thread.sleep(3000);
		
//		Clearing user input
		driver.findElement(By.name("q")).clear();
		
//		again sending input from user
		driver.findElement(By.name("q")).sendKeys("youtube");
		
//		Performing Click event
//		driver.findElement(By.id("text-container")).click();
		
//		Navigating Backward and Forward in browsing history
//		driver.navigate().back();
//		driver.navigate().forward();
		
//		Refresh/Reload Web Page
//		driver.navigate().refresh();
		
//		Fetching Data over web element
		String txt=driver.findElement(By.name("q")).getText();
		System.out.println(txt);
		
//		Closing Browser
		driver.close();
	}

}
