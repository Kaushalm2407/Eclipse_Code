package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_FramewithinFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get(String arg0)  load new webpage  in current browser window
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		try {
		//webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
