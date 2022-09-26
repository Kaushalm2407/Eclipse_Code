package assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class WorkingOn_Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebBrowser.openBrowser("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		List<WebElement> chk1= driver.findElements(By.cssSelector("input.cb1-element"));
		for(WebElement chb : chk1)
		{
			if(!chb.isSelected())
			{
				chb.click();
				System.out.println("Clicked");
			}
		}
				
	}

}
