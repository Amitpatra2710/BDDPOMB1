package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	@FindBy(css = "input.input-lg")
	WebElement searchBox;
	
	@FindBy(css = "span.input-group-btn")
	WebElement searchBtn;
	
	//Actions
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void searchitem(String strItem) {
		searchBox.sendKeys(strItem);
		searchBtn.click();
	}
	
public String getHomePageTitle() {
	return driver.getTitle();
		
	}
	
	

}
