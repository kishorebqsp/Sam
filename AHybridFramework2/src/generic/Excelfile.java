package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfile {
	public static String getexceldata(String filepath,String sheet,int row,int cell)
	{
		String s="";
		try {
		FileInputStream f=new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(f);
		 s = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		catch(Exception e)
		{
			
		}
	
		
		return s;
		
	}
	

}
