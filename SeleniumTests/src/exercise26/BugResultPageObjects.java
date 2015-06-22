// Beck; 1329591; Exercise2-6

package exercise26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BugResultPageObjects {

	WebDriver pageDriver;
	
	public BugResultPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		pageDriver = driver;
	}
	
	@FindBy(id="short_desc_nonedit_display")
	private WebElement descLbl;
	
	@FindBy(id="comment_text_0")
	private WebElement commentLbl;
	
	public String getSummary() {
		return descLbl.getText();
	}
	
	public String getDescription() {
		return commentLbl.getText();
	}
}
