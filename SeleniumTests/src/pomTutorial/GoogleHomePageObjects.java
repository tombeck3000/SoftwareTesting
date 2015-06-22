package pomTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {

	//Initialize my Objects
	public GoogleHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	public WebElement txtSearch;
	
	@FindBy(name="btnG")
	public WebElement btnSearch;
	
	@FindBy(linkText="Selenium - Web Browser Automation")
	public WebElement lnkSelenium;
	
	public void SearchGoogle(String searchText) {
		//Search for the text Selenium
		txtSearch.sendKeys(searchText);
		//Click the Search button
		btnSearch.click();
	}
	
	public SeleniumPageObjects ClickSelenium() {
		lnkSelenium.click();
		return new SeleniumPageObjects();
	}
}
