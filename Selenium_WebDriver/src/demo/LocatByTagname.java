package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class LocatByTagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebBrowser.openBrowser("https://www.google.co.in/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("No of links on Google home page :" +links.size());
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		driver.close();
	}

}
