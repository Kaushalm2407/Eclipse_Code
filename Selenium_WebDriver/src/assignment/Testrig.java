package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testrig {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/hotels/");
		
//		Select "India" Radio button.
		List<WebElement> country_type=driver.findElements(By.cssSelector("h4[class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-7 SearchBlockUIstyles__RadioText-sc-fity7j-5 hAEfdZ gcGwhT']"));
		for(WebElement ct:country_type) {
			if(ct.getText().equals("India"))
			{
				ct.click();
				System.out.println("India is Selected  :PASS");
			}
		}
//		Select Bhopal city from "Where" dropdown.
		WebElement text=driver.findElement(By.xpath("//*[@id=\"downshift-1-input\"]"));
		Actions act=new Actions(driver);
		act.click(text).perform();
		act.sendKeys(text, "bh").perform();
		Thread.sleep(1000);
		act.sendKeys(text, Keys.ARROW_DOWN).perform();
		act.sendKeys(text, Keys.ENTER).perform();
		System.out.println("Bhopal is Selected   :PASS");
		

	}

}
