package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;
import utility.WebElementMethods;

public class Demo_Site {

	public static void main(String[] args) {
		
		WebDriver driver=WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
		WebElementMethods.entertext(driver, By.xpath("//input[@ng-model='FirstName']"), "Kaushal");
		WebElementMethods.entertext(driver, By.xpath("//input[@ng-model='LastName']"), "Mishra");
		
		WebElementMethods.entertext(driver, By.xpath("//textarea[@ng-model='Adress']"), "Hadapsar Pune");
		
		WebElementMethods.entertext(driver, By.xpath("//input[@ng-model='EmailAdress']"), "kaushalm797@gmail.com");
		
		WebElementMethods.entertext(driver, By.xpath("//input[@ng-model='Phone']"), "9690332846");
		
		WebElementMethods.SelectCheckBox(driver, By.xpath("//input[@name='radiooptions']"), "Male");
		
		WebElementMethods.SelectRadio(driver, By.id("chackbox1"), "Cricket");
		WebElementMethods.SelectRadio(driver, By.id("checkbox2"), "Movies");
		WebElementMethods.SelectRadio(driver, By.id("checkbox3"), "Hockey");
		
//		WebElementMethods.selectDDByText(driver, By.cssSelector("ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all>li>a"), "Hindi");
		
		WebElementMethods.selectDDByValue(driver, By.id("Skills"), "Analytics");
		
		WebElementMethods.selectDDByValue(driver, By.id("countries"), "India");
		
//		WebElementMethods.selectDDByText(driver, By.cssSelector("span.select2-selection.select2-selection--single"), "Japan");
		
		WebElementMethods.selectDDByValue(driver, By.id("yearbox"), "1997");
		WebElementMethods.selectDDByValue(driver, By.xpath("//select[@ng-model='monthbox']"), "July");
		WebElementMethods.selectDDByValue(driver, By.id("daybox"), "13");
		
		WebElementMethods.entertext(driver, By.id("firstpassword"), "Admin@123");
		WebElementMethods.entertext(driver, By.id("secondpassword"), "Admin@123");
		
//		WebElementMethods.clickElement(driver, By.id("submitbtn"));
		WebElementMethods.clickElement(driver, By.id("Button1"));
	}

}
