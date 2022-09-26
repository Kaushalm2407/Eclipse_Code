package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;
import utility.WebElementMethods;

public class Rediff_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElementMethods.entertext(driver, By.id("login1"), "kaushalm");
		WebElementMethods.entertext(driver, By.id("password"), "admin123");
		WebElementMethods.clickElement(driver, By.name("proceed"));
		driver.close();
	}

}
