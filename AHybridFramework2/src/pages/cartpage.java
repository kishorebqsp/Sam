package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plus;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(name="Blue")
	private WebElement color;
	
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement cart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement ptoc;
	
	public cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void plussymbol()
	{
		plus.click();
	}
	
	public WebElement sizedd()
	{
		return size;
	}

	public void colors()
	{
		color.click();
	}
	
	public void addingtocart()
	{
		cart.click();
	}
	
	public void proceedtocheckout()
	{
		ptoc.click();
	}
}
