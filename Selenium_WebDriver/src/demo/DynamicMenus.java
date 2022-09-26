package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.WebBrowser;

public class DynamicMenus {

	public static void main(String[] args) {
		WebDriver driver=WebBrowser.openBrowser("https://www.istqb.org/");
		WebElement menu=driver.findElement(By.linkText("Certification"));
		Actions builder=new Actions(driver);
		
		builder.moveToElement(menu).perform();
		
		List<WebElement> submenus = driver.findElements(By.cssSelector("div.mega-inner>ul>li>a"));
		for(WebElement sb:submenus)
		{
			if(sb.getText().trim().equalsIgnoreCase("Acceptance Testing"))
			{
				sb.click();
				break;
			}
		}
			

	}

}
