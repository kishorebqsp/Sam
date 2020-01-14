package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excelfile;
import generic.Propertyfile;
import generic.Utilies;
import pages.Dresspage;
import pages.Loginpage;
import pages.cartpage;

public class Addingproducttocart extends BaseTest{
	@Test
	public void addingtocart() throws InterruptedException
	{
		Loginpage l=new Loginpage(driver);
		l.serachtextox(Propertyfile.getdata(propertypath,"product"));
		Thread.sleep(2000);
		l.serachbutton();
		
		Dresspage d=new Dresspage(driver);
		WebElement ele = d.dropdown();
		Thread.sleep(2000);
		Utilies.dropdown(ele,Propertyfile.getdata(propertypath,"sort"));
		
		Thread.sleep(2000);
		d.dressimg();
		
		cartpage c=new cartpage(driver);
		for(int i=0;i<=3;i++)
		{
			c.plussymbol();
		}
		WebElement ele2 = c.sizedd();
		Thread.sleep(2000);
		Utilies.dropdown(ele2,Propertyfile.getdata(propertypath, "size"));
		Thread.sleep(2000);
		c.colors();
		Thread.sleep(2000);
		c.addingtocart();
		Thread.sleep(3000);
		c.proceedtocheckout();
		
		
		
		
		
		
	}
	

}
