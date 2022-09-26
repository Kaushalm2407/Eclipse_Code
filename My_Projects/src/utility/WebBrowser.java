package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowser {

		public static WebDriver openBrowser(String url)
		{
			System.setProperty("webdriver.chrome.driver","I:\\My Drive\\Eclipse IDE\\My_Projects\\src\\lib\\chromedriver_104.0.5112.79.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
		}
		public static void verifyTitle(WebDriver driver, String exptitle)
		{
			String acttitle=driver.getTitle();
			if(acttitle.equals(exptitle))
			{
				System.out.println("Title mached");
			}
			else
				System.out.println("Title not mached");
		}
		
}