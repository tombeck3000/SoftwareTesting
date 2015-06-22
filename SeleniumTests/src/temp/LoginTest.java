package temp;

import org.openqa.selenium.support.PageFactory;

import exercise26.BugzillaHomePageObjects;

public class LoginTest {

	public static void main(String[] args) {
		Driver.driver = Driver.browser("firefox");
		CommUtil.launchBrowser("http://192.168.0.15/");
		
		BugzillaHomePageObjects bugzillaHomePage = PageFactory.initElements(Driver.driver, BugzillaHomePageObjects.class);
		//bugzillaHomePage.validateBugzillaHomeTitle();
		bugzillaHomePage.loginToBugzilla("admin", "admin");
	}

}
