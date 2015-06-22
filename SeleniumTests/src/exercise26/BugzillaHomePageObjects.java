// Beck; 1329591; Exercise2-6

package exercise26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BugzillaHomePageObjects {
		
	WebDriver pageDriver;
	
	public BugzillaHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		pageDriver = driver;
	}
	
	@FindBy(id="login_link_top")
	private WebElement loginLbl;
	
	@FindBy(id="Bugzilla_login_top")
	private WebElement bugzillaUsername;
	
	@FindBy(id="Bugzilla_password_top")
	private WebElement bugzillaPassword;
	
	@FindBy(id="log_in_top")
	private WebElement loginBtn;
	
	@FindBy(id="error_msg")
	private WebElement errorMsg;
	
	
	public boolean loginToBugzilla(String username, String password) {
		try {
			loginLbl.click();
			bugzillaUsername.clear();
			bugzillaUsername.sendKeys(username);
			bugzillaPassword.clear();
			bugzillaPassword.sendKeys(password);
			loginBtn.click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean loginFailedAttempt(String username, String password) {
			loginLbl.click();
			bugzillaUsername.clear();
			bugzillaUsername.sendKeys(username);
			bugzillaPassword.clear();
			bugzillaPassword.sendKeys(password);
			loginBtn.click();
			
			return errorMsg.isDisplayed();
		}
	
	public String currentUrl() {
		return pageDriver.getCurrentUrl();
	}
}