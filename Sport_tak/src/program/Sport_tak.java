package program;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//	@Listeners(program.TestNG_Listener.class)
public class Sport_tak {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void Setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "I:\\My Drive\\Automation_A\\Sport_tak\\lib\\chromedriver_105.0.5195.127.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://hindi.thesportstak.com/");
		Thread.sleep(1000);
	   
	}
	
	
	@Test
	public void tc_01_SelectLang()
	{
		String lang=driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/button[2]/span[1]")).getText();
	    
	    if(lang.equalsIgnoreCase("eng"))
	    {
	    	System.out.println("Hindi Language is Selected");
	    	driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/button[2]/span[1]")).click();
	    	System.out.println("Now English language is Selected");
	    }
	    else
	    {
	    	System.out.println("English Language is Selected");
	    	driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/button[2]/span[1]")).click();
	    	System.out.println("Now Hindi language is Selected");
	    }
	}
	
	@Test
	public void tc_02_VerifyBrokenLinks()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
		
		for(int i=1; i<links.size(); i++)
		{
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
			try {
				URL link=new URL(url);
				
				HttpURLConnection connection=(HttpURLConnection) link.openConnection();
				connection.connect();
				int Rescode=connection.getResponseCode();
				String ResMsg= connection.getResponseMessage();
				connection.disconnect();
				
				if(Rescode>=400)
				{
					System.out.println(url +"-->"+"Broken link");
				}
				else
				{
					System.out.println(url +"-->"+ResMsg);
				}
				
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	@Test
	public void tc_03_Cricket() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//span[contains(text(),'Cricket')]")).click();
		Thread.sleep(3000);
	    
	     driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div[1]/div[4]/div[3]/div[2]/a/h2")).click();
	    
	    List<WebElement> lks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+lks.size());
		
		for(int i=1; i<=lks.size(); i++)
		{
			WebElement element=lks.get(i);
			String url=element.getAttribute("href");
			
			try {
				URL lk=new URL(url);
				
				HttpURLConnection connection=(HttpURLConnection) lk.openConnection();
			
				connection.connect();
				int Rescode=connection.getResponseCode();
				String ResMsg=connection.getResponseMessage();
//				connection.disconnect();
				
				if(Rescode>=400)
				{
					System.out.println(url +"-->"+"Broken Link");
				}
				else
				{
					System.out.println(url +"-->"+ResMsg);
				}
				
				
				
			} catch (Exception e) {
				  lks=driver.findElements(By.tagName("a"));
					System.out.println("Total links are "+lks.size());
				e.printStackTrace();
			}
		}
	    
	}
	
	@Test
	public void tc_04_theme() throws InterruptedException
	{
		String theme=driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/button[1]/span[1]")).getText();
		if(theme.equalsIgnoreCase("dark"))
		{
			System.out.println("Light Theme already selected");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/button[1]/span[1]")).click();
			System.out.println("Now Dark Theme is selected");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/button[1]/span[1]")).click();
			System.out.println("Light Theme is selected again");
		}
		else
		{
			System.out.println("Dark Theme already selected");
			driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/button[1]/span[1]")).click();
			System.out.println("Now Light Theme is selected");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[2]/div[1]/div[1]/button[1]/span[1]")).click();
			System.out.println("Dark Theme is selected again");
			
			
		}
	}
	
	
	@Test
	public void tc_05_WebStory() throws InterruptedException 
	{   
		driver.findElement(By.xpath("//a[@href='/webstories']")).click();
		Thread.sleep(5000);
		
		WebElement ws=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]"));
		ws.click();
		Thread.sleep(2000);
		
	}
		

	@AfterClass
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
