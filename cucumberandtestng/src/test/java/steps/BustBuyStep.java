package steps;

import common.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BestBuyPage;

public class BustBuyStep extends Base {
	
     public BestBuyPage bbPage;
	
	@Given("I am on the BustBuy Home page")
	public void i_am_on_the_bust_buy_home_page() {
		setUp();
		bbPage=new BestBuyPage(driver); 
		
		bbPage.setUp();
		
		
	}

	@When("I click ShopNow")
	public void i_click_shop_now() {
	    bbPage.getShopNow();
	}

	@Then("I coud land the page for current deals")
	public void i_coud_land_the_page_for_current_deals() {
	    
	}

}
