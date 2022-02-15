package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage extends TestBase {
	
	/*
	 * @FindBy(className = "btn btn-inverse btn-block btn-lg dropdown-toggle")
	 * WebElement addedItems;
	 */
	
	@FindBy(xpath = "//span[contains(text(), 'Checkout')]")
	WebElement checkOutBtn;
	
	@FindBy(css = ".pull-right .btn-primary")
	WebElement finalcheckOutBtn;;
	

	//Actions
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	

	/*
	 * public void addItemToCart() {
	 * 
	 * addedItems.click();
	 * 
	 * }
	 */

public void checkout() {
	
	checkOutBtn.click();
}

public void finalCheckOut() {
	
	finalcheckOutBtn.click();
}

}
