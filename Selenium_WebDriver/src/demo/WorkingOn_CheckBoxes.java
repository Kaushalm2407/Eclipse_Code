package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;
import utility.WebElementMethods;

public class WorkingOn_CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= WebBrowser.openBrowser("https://echoecho.com/htmlforms09.htm");
		WebElementMethods.SelectCheckBox(driver, By.cssSelector("td.table5>input"),"Cheese");
		
	} 

}
