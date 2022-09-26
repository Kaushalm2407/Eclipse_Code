package demo;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;
import utility.WebTable;

public class WorkingOnTable_1 {

	public static void main(String[] args) {
		int rnum=3;
		int cnum=2;
		WebDriver driver=WebBrowser.openBrowser("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		String data= "3;SEO tags;Loblab Dan;failed qa";
		String[] adata=data.split(";");
		List<String> expdata= Arrays.asList(adata);
		
		List<String> actdata= WebTable.getRowData(driver, By.id("task-table"), 3);
		if(expdata.equals(actdata))
		{
			System.out.println("Row verified successfully");
		}
		
		String expcelldata="Loblab Dan";
		String actcelldata=WebTable.getCellData(driver, By.id("task-table"), rnum, cnum);
		if(expcelldata.equals(actcelldata))
		{
			System.out.println("Cell verified successfully");
		}
		driver.close();
		//for all rows -//table[@id='task-table']/tbody/tr
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		
		//Single row by index
		WebElement row=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+rnum+"]"));
		
		//Columns of a row
		List<WebElement> cells= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr["+rnum+"]/td"));
		
		//Single cell
		WebElement cell= driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+rnum+"]/td["+cnum+"]"));
	}

}
