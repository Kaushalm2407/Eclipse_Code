package Assignment;

import org.testng.annotations.Test;

import utility.WebBrowser;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Familycare_Login {
	WebDriver driver;
  @Test
  public void ValidLogin() throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys("kaushalm797@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.id("password")).sendKeys("Admin@123");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("span.MuiButton-label")).click();
  }
  @Test
  public void InvalidLogin() throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys("invalid@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.id("password")).sendKeys("invalid123");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("span.MuiButton-label")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  driver=WebBrowser.openBrowser("http://www.familycarecircle.com/login");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
