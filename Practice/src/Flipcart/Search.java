package Flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "I:\\My Drive\\Automation Testing\\Chrome_Driver\\chromedriver_100.0.4896.60.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//Login
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9690332846");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Kaushalm2407");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(3000);
		
		//Search
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//Verify Title
		String at=driver.getTitle();
		System.out.println(at);
		String et="Iphone- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		System.out.println(et);
		Thread.sleep(4000);
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Both Title Matched");
		}
		else
		{
			System.out.println("Both Title Not Matched");
		}
		
		//Add to Cart
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/img")).click();
//		
		//Place Order
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
//		Thread.sleep(2000);
//		//Address
//		driver.findElement(By.linkText("Deliver Here")).click();
//		Thread.sleep(2000);
//		//Order Summery
//		driver.findElement(By.linkText("CONTINUE")).click();
//		Thread.sleep(2000);
//		//Payment Using Wallet
//		driver.findElement(By.id("WALLETOTHERS")).click();
//		Thread.sleep(3000);
		driver.close();
	}
}
