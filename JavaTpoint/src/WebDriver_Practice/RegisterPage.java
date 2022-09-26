package WebDriver_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "I:\\My Drive\\Automation Testing\\JavaTpoint\\lib\\ChromeDriver_103.0.5060.53.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		String actTitle=driver.getTitle();
		String extTitle="Register";
		System.out.println(actTitle);
		if(actTitle.equals(extTitle))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title not Matched");
		}
		
		driver.findElement(By.xpath("//input [@ng-model='FirstName']")).sendKeys("Kaushal");
		driver.findElement(By.xpath("//input [@ng-model='LastName']")).sendKeys("Mishra");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea [@ng-model='Adress']")).sendKeys("Hadapsar Pune");
		driver.findElement(By.xpath("//input [@ng-model='EmailAdress']")).sendKeys("kaushalm797@gmail.com");
		driver.findElement(By.xpath("//input [@ng-model='Phone']")).sendKeys("9690332846");
		Thread.sleep(3000);
		driver.findElement(By.name("radiooptions")).click();
//		String code=driver.getPageSource();
//		System.out.println(code);
		driver.findElement(By.id("checkbox1")).click();
		driver.close();
		
		

	}

}
