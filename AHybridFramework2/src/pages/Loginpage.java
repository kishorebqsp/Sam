package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="search_query_top")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement serachbtn;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void serachtextox(String productname)
	{
		serachtb.sendKeys(productname);
	}
	
	public void serachbutton()
	{
		serachbtn.click();
	}

}
