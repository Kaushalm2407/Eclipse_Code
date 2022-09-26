package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;

public class LocateLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebBrowser.openBrowser("https://www.google.co.in/");
		driver.findElement(By.linkText("Gmail")).click();
		WebBrowser.verifyTitle(driver,"Gmail Atom Feed");
		driver.navigate().back();
		driver.findElement(By.linkText("Images")).click();
		WebBrowser.verifyTitle(driver,"Google Images");
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Advert")).click();
		WebBrowser.verifyTitle(driver, "Get More Customers With Easy Online Advertising | Google Ads");
		driver.navigate().back();
		driver.findElement(By.partialLinkText("How Search")).click();
		driver.close();
	}

}
