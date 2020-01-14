package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconstant {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		String url = Propertyfile.getdata(propertypath,"URL");
		driver.get(url);
	
	}
	
	@AfterMethod
	public void closeapp(ITestResult r)
	{
		int status = r.getStatus();
		if(status==2)
		{
			Photos.getphoto(driver,potopath);
		}
		driver.close();
	}

}
