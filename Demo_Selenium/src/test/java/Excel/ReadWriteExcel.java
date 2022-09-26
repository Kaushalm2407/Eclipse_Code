package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel 
{
	public static void writeToExcel(File f) throws IOException
	{
		FileOutputStream fos=new FileOutputStream(f);
		XSSFWorkbook wbook=new XSSFWorkbook();
		XSSFSheet sheet =wbook.createSheet("data");
		for(int i=0; i<3; i++)
		{
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<3; j++)
			{
				XSSFCell cell=row.createCell(j);
				cell.setCellValue("test"+i+j);
			}
		}
		wbook.write(fos);
		wbook.close();
		fos.close();
	}
	public static void readExcel(File f) throws IOException
	{
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=wbook.getSheet("data1");
		for(Row row : sheet)
		{
			for(Cell cell:row)
			{
//				String value=cell.getStringCellValue();
//				System.out.println(value);
				printCellData(cell);
			}
		}
		wbook.close();
		fis.close();
	}
	public static void printCellData(Cell cell)
	{
		CellType type=cell.getCellType();
		switch (type) {
		case STRING:
			System.out.println(cell.getStringCellValue());
			break;
		case NUMERIC:
			System.out.println(cell.getNumericCellValue());
			break;	
		case BOOLEAN:
			System.out.println(cell.getBooleanCellValue());
			break;
		case BLANK:
			System.out.println("Cell is Blank");
			break;
		case ERROR:
			System.out.println(cell.getErrorCellValue());
			break;
		case FORMULA:
			System.out.println(cell.getCellFormula());
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) throws IOException {
		
		File f=new File("src\\test\\resources\\Test.xlsx");
//		writeToExcel(f);
//		System.out.println("Done");
		readExcel(f);

	}

}
