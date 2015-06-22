// Beck; 1329591; Exercise2-6

package exercise26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizedHomePageObjects {
	
	WebDriver pageDriver;
	
	public AuthorizedHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		pageDriver = driver;
	}
	
	@FindBy(linkText="Neu")
	private WebElement neuBtn;
	
		
	public void clickNewBugButton() {
		neuBtn.click();
	}
	
}
