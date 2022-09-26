package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class WorkingOnTable {

	public static void main(String[] args) {

		WebDriver driver=WebBrowser.openBrowser("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		WebElement table=driver.findElement(By.id("task-table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Number of rows in the table :" +rows.size());
		for(WebElement row: rows)
		{
			List<WebElement> cells=row.findElements(By.tagName("td"));
			for(WebElement cell:cells)
			{
				System.out.println(cell.getText());
			}
		}
		driver.findElement(By.cssSelector("table.table:nth-child(2)"));
		table.findElements(By.tagName("tr"));
		System.out.println("Number of rows in the table :" +rows.size());
		for(WebElement row: rows)
		{
			List<WebElement> cells=row.findElements(By.tagName("td"));
			for(WebElement cell:cells)
			{
				System.out.println(cell.getText());
			}
		}

	}

}
