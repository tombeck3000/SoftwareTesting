// Beck; 1329591; Exercise2-6

package exercise26;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAndCreateBugPageObjectTest {
	
	 private WebDriver driver;
	 private StringBuffer verificationErrors = new StringBuffer();
	 
	 BugzillaHomePageObjects bugHomePage;
	 AuthorizedHomePageObjects authHomePage;
	 CreateBugPageObjects createBugPage;
	 BugResultPageObjects bugResultPage;
	 
	 
  @Before
  public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	  driver.navigate().to("http://192.168.0.15/");
	  bugHomePage = new BugzillaHomePageObjects(driver);
	  authHomePage = new AuthorizedHomePageObjects(driver);
	  createBugPage = new CreateBugPageObjects(driver);
	  bugResultPage = new BugResultPageObjects(driver);	  
  }

  @Test
  public void testLoginAndCreateBug() throws Exception {
	  
	  //Login to Bugzilla
	  bugHomePage.loginToBugzilla("admin", "admin");
	  
	  //Check if I am logged in
	  assertEquals("http://192.168.0.15/index.cgi", bugHomePage.currentUrl());
	  
	  //Click the neu Bug button on authorized Home Page
	  authHomePage.clickNewBugButton();
	  
	  //Create a new Bug
	  createBugPage.createNewBug("seleniumBug", "Bug for a selenium Test");
	  
	  //Check if description and comment are saved correctly
	  assertEquals("seleniumBug", bugResultPage.getSummary());
	  assertEquals("Bug for a selenium Test", bugResultPage.getDescription());
    
  }

  @Test
  public void testLoginAndCreateBugWithEmptySummary_ErrorMessageShouldDisplay() {
	  
	  //Login to Bugzilla
	  bugHomePage.loginToBugzilla("admin", "admin");
	  
	  //Check if I am logged in
	  assertEquals("http://192.168.0.15/index.cgi", bugHomePage.currentUrl());
	  
	  //Click the neu Bug button on authorized Home Page
	  authHomePage.clickNewBugButton();
	  
	  //Create a new Bug
	  String alertText = createBugPage.createNewBug(null, "Bug for a selenium Test");
	  
	  //Check if the alert pops up
	  assertEquals("Bitte geben Sie eine Kurzbeschreibung für den neuen Bug an.", alertText);
	  
  }
  
  
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
