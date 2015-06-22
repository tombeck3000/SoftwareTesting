// Beck; 1329591; Exercise2-6

package exercise26;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginPageObjectTest {
	
	private StringBuffer verificationErrors = new StringBuffer();
	public static WebDriver driver;
	BugzillaHomePageObjects bugHomePage;
	
	@Before
	public void setUp() {
	    driver = new FirefoxDriver();
	    driver.navigate().to("http://192.168.0.15/");
	    bugHomePage = new BugzillaHomePageObjects(driver);
	}
		
	
	@Test
	public void testLoginSuccessfull() throws Exception {		
		assertTrue(bugHomePage.loginToBugzilla("admin", "admin"));
	}
		
	@Test
	public void testLoginFailedAttempt() {
		assertTrue(bugHomePage.loginFailedAttempt("admin", "xxx"));
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }

	}

}
