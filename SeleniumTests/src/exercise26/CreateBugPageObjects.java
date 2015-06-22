// Beck; 1329591; Exercise2-6

package exercise26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateBugPageObjects {
	
	WebDriver pageDriver;
	
	public CreateBugPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		pageDriver = driver;
	}
	
	@FindBy(name="short_desc")
	private WebElement descTxt;
	
	@FindBy(id="comment")
	private WebElement commentTxt;
	
	@FindBy(id="commit")
	private WebElement commitBtn;
	
	@FindBy()
	private WebElement errorMsg;

	public String createNewBug(String summary, String description) {
		descTxt.clear();
		descTxt.sendKeys(summary);
		commentTxt.clear();
		commentTxt.sendKeys(description);
		commitBtn.click();
		
		return alertText();
	}
	
	private String alertText() {
		try {
			Alert alert = pageDriver.switchTo().alert();
			return alert.getText();
		} catch (Exception e) {
			return "No Alert";
		}
	}
	
}
