package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class WebScrapping {

	public static void main(String[] args) {
		WebDriver driver=WebBrowser.openBrowser("https://www.flipkart.com/search?q=oneplus+9+pro");
		int count=1;
		while(true) {
			try {
			List<WebElement> list=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
				
				for (WebElement ele : list) {
					if(WebBrowser.isVisible(driver, ele)) {
						System.out.println(count+"."+ele.getText());
						count++;
					}
					
				}
				if(WebBrowser.isVisible(driver, By.xpath("//*[text()='Next']")).isDisplayed()) {
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[text()='Next']")).click();
					Thread.sleep(3000);
				}
			
			}
			catch (Exception e) {
				break;
			}
		}

	}

}