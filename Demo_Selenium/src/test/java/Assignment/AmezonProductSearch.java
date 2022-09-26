package Assignment;

import org.testng.annotations.Test;

import utility.WebBrowser;
import utility.WebElementMethods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class AmezonProductSearch {
	WebDriver driver;
  @Test(dataProvider = "finddata")
  public void SearchProduct(String text) {
	  WebElementMethods.entertext(driver, By.id("twotabsearchtextbox"), text);
	  WebElementMethods.clickElement(driver, By.id("nav-search-submit-button"));
  }
  @DataProvider
  public String[][] finddata()
  {
	  String[][] data=new String [6][1];
	  data[0][0]="book";
	  data[1][0]="tshirts";
	  data[2][0]="keyboard";
	  data[3][0]="mobile";
	  data[4][0]="earphone";
	  data[5][0]="Laptop";
	  return data; 
  }
  
  @AfterMethod
  public void cleardata() throws InterruptedException
  {	  Thread.sleep(2000);
	  driver.findElement(By.id("twotabsearchtextbox")).clear();
  }
  @BeforeClass
  public void beforeClass() {
	  driver=WebBrowser.openBrowser("https://www.amazon.in/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
