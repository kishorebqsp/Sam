package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage {
	@FindBy(id="selectProductSort")
	private WebElement dd;
	
	@FindBy(xpath="(//img[@title='Printed Summer Dress'])[1]")
	private WebElement dress;
	
	public Dresspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement dropdown()
	{
		return dd;
	}
	
	public void dressimg()
	{
		dress.click();
	}

}
