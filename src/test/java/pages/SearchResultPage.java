package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase {

	@FindBy(linkText = "Search")
	WebElement SearchHeading;
	
	@FindBy(xpath = "//span[contains(text(), 'Add')]")
	WebElement addtoCartBtn;
	
	@FindBy(css = "div.product-thumb")
	List<WebElement> items;
	
	@FindBy(css="span#cart-total")
	WebElement cartTotal;

	//Actions
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	

public void addItemToCart() {
	
	if(items.size() > 0)
	{
		addtoCartBtn.click();
	}	
}

public boolean isItemAdded() {
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String total = cartTotal.getText();
	System.out.println("Cart Total is :" +total);
	String itemCount = total.split(" ")[0];
	int intCount = Integer.parseInt(itemCount);
	if(intCount > 0) {
		return true;
	}else {
	return false;
	}
}
 
}