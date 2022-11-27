package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestBuyPage {
	
	WebDriver driver;
	
	  public BestBuyPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath  = "//a[normalize-space()='Apple']")  WebElement ShopNow;
	
	public void setUp()
	
	{
		driver.get("https://www.bestbuy.com/");
	}
	
	public void  getShopNow()
	{
		//driver.switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ShopNow.click();
		
		//return true;
	}

	

}
