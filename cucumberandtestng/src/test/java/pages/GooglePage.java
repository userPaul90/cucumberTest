package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Base;

public class GooglePage {
	WebDriver driver;
//1	Base bs= new Base();
	public GooglePage(WebDriver driver ) {
		this.driver=driver;
		System.out.println("google Page");
	}
	
	By inputBox=By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
	
	public void launchPage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public   WebElement sendInput()
     {
    	return driver.findElement(inputBox);
     }
     
	
	
	
	

}
