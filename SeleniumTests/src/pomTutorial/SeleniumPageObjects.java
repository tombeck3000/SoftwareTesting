package pomTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageObjects {

	public SeleniumPageObjects() {
		
	}
	
	public SeleniumPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Download")
	public WebElement lnkDownload;
	
	@FindBy(xpath = "//div[@id='header']/h1/a")
	public WebElement lnkHome;
	
	public boolean ClickDownloads() {
		lnkDownload.click();
		return true;
	}
	
	public boolean NavigateHome() {
		lnkHome.click();
		return true;
	}
	
//	public boolean validateBugzillaHomeTitle() {
//	try {
//		assertEquals(, "Bugzilla-Hauptseite", "Bugzilla Home Page title validation failed");
//	} catch(Exception e) {
//		return false;
//	}
//	return true;
//}
	
}
