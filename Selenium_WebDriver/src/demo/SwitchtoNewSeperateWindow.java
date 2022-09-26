package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * When we test for alert it is called as yellow-box testing
 * Alert is java-script or window message 
 * Simple alert is alert which display information where we can only accept(ok)
 * */
public class SwitchtoNewSeperateWindow {

	public static void main(String[] args) {
		// To handle alert(javascript) in selenium webdriver there is interface Alert
		// WebDriver is parent interface which is implemented in chromedriver class

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// get(String arg0) load new webpage in current browser window
		driver.get("http://demo.automationtesting.in/Windows.html");

		driver.findElement(By.linkText("Open New Seperate Windows")).click();

		// getWindowHandle() return string of Session Id
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		// getWindowHandles() return Set of string of all Session Id
		Set<String> childId = driver.getWindowHandles();

		try {
			for (String win : childId) {
				if (!win.equalsIgnoreCase(parentId)) {
					driver.switchTo().window(win);
					driver.manage().window().maximize();
					System.out.println(driver.getTitle());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}