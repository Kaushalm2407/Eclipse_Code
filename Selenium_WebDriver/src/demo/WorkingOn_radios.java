package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;
import utility.WebElementMethods;

public class WorkingOn_radios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebBrowser.openBrowser("https://echoecho.com/htmlforms10.htm");
		WebElementMethods.SelectRadio(driver, By.name("group1"), "cheese");
		WebElementMethods.SelectRadio(driver, By.name("group2"), "beer");
	}

}
