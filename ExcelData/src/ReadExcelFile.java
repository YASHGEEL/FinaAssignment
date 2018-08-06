import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelFile 
{
	

	public static void main(String args[]) throws BiffException, IOException {
		String FilePath = "D:\\sample.xlsx";
		
		FileInputStream fs = new FileInputStream(new File(FilePath));
		XSSFWorkbook wb = new XSSFWorkbook(fs);

		XSSFSheet sh = wb.getSheetAt(0);
		int r = sh.getLastRowNum();
		System.out.println(r);
		for(int i=0;i<=r;i++)
		{
		Row row = sh.getRow(i);
		System.out.print(sh.getRow(i).getCell(0));
		Cell cell = row.getCell(1);
		System.out.println(" " + cell);
		}
		
	}
}
