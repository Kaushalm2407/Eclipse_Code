package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.WebBrowser;

/*
 * Actions it help to control mouse and keyboard event using advanced interaction api
 * Using actions we can perform Complex event like mouse hover,double click,right click
 * ENTER,ALT,CTRL+C 
 * */

public class Keyboardevent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=WebBrowser.openBrowser("https://www.google.com/");
		
		WebElement search=driver.findElement(By.name("q"));
		
		Actions act=new Actions(driver);
		
		act.sendKeys(search, "ipl").perform();
		Thread.sleep(5000);
		
		for(int i=0;i<5;i++) {
			Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		act.sendKeys(search, Keys.ENTER).perform();
		
		Thread.sleep(5000);
		WebElement search1=driver.findElement(By.name("q"));
		search1.clear();
		
		act.sendKeys("psg").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
