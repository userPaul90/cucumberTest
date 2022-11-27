package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Base;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GooglePage;

public class Search extends Base {
	//WebDriver driver=WebDriverManager.chromedriver().create();
	//*WebDriver driver;
	//Base bs= new Base();
	GooglePage pg;
	@Before
	 public void set()
	{
		System.out.println("in search setup 1");
		//1driver=super.setUp();
		setUp();
		pg= new GooglePage(driver);
		System.out.println("in search setup 2");
	}
	@Given("I am on the goole home search page")
	public void i_am_on_the_goole_home_search_page() {
    
		
		pg.launchPage("https://www.google.com/");
	//pg.launchPage("https://www.google.com/");
		//*driver.get("https://www.google.com/");
	}

	@When("I enter  search {string}")
	public void i_enter_search(String string) {
		
	   pg.sendInput().sendKeys(string);
	}

	@When("I enter google search button")
	public void i_enter_google_search_button() {
	   
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
	   System.out.println("last"); 
	  
	   driver.close();
	}
}
