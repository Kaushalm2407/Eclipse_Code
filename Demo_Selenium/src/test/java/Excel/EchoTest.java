package Excel;

import utility.WebBrowser;
import utility.WebElementMethods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class EchoTest {
	WebDriver driver;
	File f;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int rownum,colnum;
	int rescol;
	int startrow=1;

	 @Test (dataProvider="getdata")
	  public void guestloginDDT(String username, String password) throws IOException {
		 rescol=colnum-1; 
		 WebElementMethods.entertext(driver, By.id("txtCustomerID"), username);
		  WebElementMethods.entertext(driver, By.id("txtPassword"), password);
		  WebElementMethods.clickElement(driver, By.id("Butsub"));
		  if(driver.findElement(By.id("lblMsg")).getText().equals("Invailid Username/Password"))
		  {
			  fos=new FileOutputStream(f);
			  row=sheet.getRow(startrow);
			  cell=row.getCell(rescol);
			  cell.setCellValue("Pass");
			  wbook.write(fos);
			  startrow ++;
		  }
		  else 
		  {
			  fos=new FileOutputStream(f);
			  row=sheet.getRow(startrow);
			  cell=row.getCell(rescol);
			  cell.setCellValue("Fail");
			  wbook.write(fos);
			  startrow ++;
		  }
		  assertEquals(driver.findElement(By.id("lblMsg")).getText(),"Invailid Username/Password");
	 }
	  //Returns a double dimensional array
	  //1st dimension is no of rows- no of times the test will be execute
	  //2nd dimension is no of cols- no of parameters sent to the method
	  @DataProvider
	  public String[][] getdata() throws IOException
	  {
		  
		fis=new FileInputStream(f);
		  wbook=new XSSFWorkbook(fis);
		  sheet=wbook.getSheet("logindata");
		  rownum=sheet.getPhysicalNumberOfRows();
		  colnum=sheet.getRow(0).getPhysicalNumberOfCells();
		  String [][] data=new String[rownum-1][colnum-1];
		  for(int i=1; i<rownum; i++)
		  {
			  row=sheet.getRow(i);
			  for(int j=0; j<colnum-1; j++)
			  {
				  cell=row.getCell(j);
				  data[i-1][j]=cell.getStringCellValue();
			  }
		  }
		  return data;
	  }
	  @AfterMethod
	  public void clearData() {
		  driver.findElement(By.id("txtCustomerID")).clear();
		  driver.findElement(By.id("txtPassword")).clear();
	  }
	
  @BeforeClass
  public void beforeClass() {
	  driver=WebBrowser.openBrowser("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	  f=new File("src\\test\\resources\\logindata.xlsx");
  }
  
  @AfterClass
  public void afterClass() throws IOException {
	  driver.close();
	  wbook.close();
	  fis.close();
	  fos.close();
  }

}

