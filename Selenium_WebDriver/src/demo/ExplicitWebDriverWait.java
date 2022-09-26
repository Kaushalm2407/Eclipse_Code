package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Explicit wait is applied for particular condition/webelement to be true 
 * 
 * */
public class ExplicitWebDriverWait {

	public static void main(String[] args) {

		// WebDriver is parent interface which is implemented in chromedriver class

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// get(String arg0) load new webpage in current browser window
		driver.get("https://www.google.com/");
		// WebDriverWait is class in which there is parameterized constructor which take
		// argument webdriver driver reference and time in second

		WebDriverWait wt = new WebDriverWait(driver, 30);

		try {
			driver.findElement(By.name("q")).sendKeys("ipl");

			By locator = By.xpath("//ul[@class='G43f7e']//li");
			
			/*until() is method of webDriverWait which take argument 
			//ExpectedConditions class which have static method
			//which help us to perform validation
			//ExpectedConditions.alertIsPresent() wait for alert to be present
			//ExpectedConditions.visibilityOf(element) wait for webelement to be present
			//ExpectedConditions.elementToBeClickable(element) wait for webelement to be click 
			ExpectedConditions.stalenessOf(element) wait for webelement to be click 
			*/
			
			wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

			List<WebElement> list = driver.findElements(locator);

			for (WebElement ele : list) {
				System.out.println(ele.getText());
			}
			for (WebElement ele : list) {
				if(ele.getText().equalsIgnoreCase("ipl points table")) {
					ele.click();
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}