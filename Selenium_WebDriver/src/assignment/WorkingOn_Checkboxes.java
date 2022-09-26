package assignment;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class WorkingOn_Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");

		List<WebElement> chckboxs=driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		for(WebElement we: chckboxs)
		{
			if(we.getAttribute("value").equalsIgnoreCase("Cricket"))
			{
				if(!we.isSelected())
				{
					we.click();
					System.out.println("Clicked");
				}
			}
			
//			if(we.getAttribute("value").equals("Movies"))
//			{
//				if(!we.isSelected())
//				{
//					we.click();
//					System.out.println("Clicked");
//				}
//			}
//		
//			if(we.getAttribute("value").equals("Hockey"))
//			{
//				if(!we.isSelected())
//				{
//					we.click();
//					System.out.println("Clicked");
//				}
//			}
		}
	}
}
