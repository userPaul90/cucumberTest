package common;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
 public WebDriver driver;
 public	WebDriver setUp() {
		//if(driver==null)
		//{
		driver=	WebDriverManager.chromedriver().create();
		//}
		System.out.println("in Base");
		return driver;
	}

}
