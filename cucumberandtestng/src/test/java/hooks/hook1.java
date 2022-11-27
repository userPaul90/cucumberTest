package hooks;

import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook1 {
	@Before
	public void setup()
	{/*	
        driver =this.setUp();
		//driver=	WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com/");
		*/
		
		System.out.println("Iam setup");
	
	//	driver= new ChromeDriver();
	}
	@After("@smoke")
	public void tearDown()
	{
		
		System.out.println("Iam Exiting");
	
	//	driver= new ChromeDriver();
	}
	@Test
	public void testing()
	{
		System.out.println("I am  in testing");
	}
}
