package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.WebBrowser;

public class DynamicMenus_DemoSite {

	public static void main(String[] args) {

		WebDriver driver=WebBrowser.openBrowser("http://demo.automationtesting.in/Register.html");
		WebElement menu=driver.findElement(By.linkText("SwitchTo"));
		Actions builder=new Actions(driver);
		builder.moveToElement(menu).perform();
		List<WebElement> submenus=driver.findElements(By.cssSelector("ul.dropdown-menu>li>a"));
		for(WebElement sb:submenus)
		{
			if(sb.getText().equalsIgnoreCase("Windows"));
			sb.click();
			break;
		}

	}

}
