package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;

public class JustDail_Ratings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=WebBrowser.openBrowser("https://www.justdial.com/RT-49FB14BM?source=7&city=Pune&wap=7&version=&nh=1&hide_header=1&el=1&notch=&sid=wnCqCq0hY4olR8pjyZZ74vuZcnMQfb2kY%2Ft4GXPwD18%3D");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Gopal");
		Thread.sleep(2000);
		driver.findElement(By.id("num_rc_mob")).sendKeys("9568897141");
		Thread.sleep(2000);
		driver.findElement(By.id("sbutton")).click();
	}

}
