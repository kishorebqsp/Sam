package generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Photos {
	
	public static String getphoto(WebDriver driver,String path)
	{
		String s="";
	Date d=new Date();
	String sd=d.toString();
	String date=sd.replaceAll(":","-");
	TakesScreenshot t=(TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest =new File(path+date+".png");
	try {
	FileUtils.copyFile(src, dest);
	}
	catch(Exception e)
	{
		Reporter.log("test case fsiled and photo taken");
	}
	
	return s;

}
}