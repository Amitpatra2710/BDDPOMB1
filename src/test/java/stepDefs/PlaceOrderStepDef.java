package stepDefs;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchResultPage;

public class PlaceOrderStepDef extends TestBase {
	HomePage homePage;
	SearchResultPage resultPage;
	CheckOutPage checkOutPage;
	@Before
	public void setup() {
		initialize();
		homePage = new HomePage();
		resultPage = new SearchResultPage();
		checkOutPage = new CheckOutPage();
	}
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		String pageTitle = homePage.getHomePageTitle();
		Assert.assertEquals(pageTitle, "Your Store");

	}

	@When("User search {string}")
	public void user_search_home_page(String strItem) {
		homePage.searchitem(strItem);

	}

	@When("User Add Item to Cart")
	public void user_add_item_to_cart() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resultPage.addItemToCart();

	}

	@Then("Item must be added to cart")
	public void item_must_be_added_to_cart() {
		boolean isItemCount = resultPage.isItemAdded();
		Assert.assertTrue(isItemCount);
		
		checkOutPage.checkout();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		checkOutPage.finalCheckOut();
	}


}
