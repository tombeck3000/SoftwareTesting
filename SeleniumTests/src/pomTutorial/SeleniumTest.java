package pomTutorial;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;

import static org.junit.Assert.*;

public class SeleniumTest {

	boolean downloadClicked = false;
	boolean navigateHomeClicked = false;
	
	private StringBuffer verificationErrors = new StringBuffer();
	public static WebDriver driver;
	
	@Before
	public void setUp() {
	    driver = new FirefoxDriver();
	    driver.navigate().to("http://www.seleniumhq.org");
	    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void testLogin() throws Exception {
				
		// Object for the page
		SeleniumPageObjects selPage = new SeleniumPageObjects(driver);
		
		//Wait for the Page to load
		Thread.sleep(5000);
				
		//Click Download Tab
		downloadClicked = selPage.ClickDownloads();
				
		//Wait for the Page to load
		Thread.sleep(5000);
						
		//Navigate Home Page
		navigateHomeClicked = selPage.NavigateHome();
		
		assertTrue(downloadClicked);
		assertTrue(navigateHomeClicked);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }

	}
//	public static void main(String[] args) throws InterruptedException {
//		
//		driver.navigate().to("http://www.seleniumhq.org");
//		
//		// Object for the page
//		SeleniumPageObjects selPage = new SeleniumPageObjects(driver);
//				
//		//Wait for the Page to load
//		Thread.sleep(5000);
//		
//		//Click Download Tab
//		selPage.ClickDownloads();
//		
//		//Wait for the Page to load
//		Thread.sleep(5000);
//				
//		//Navigate Home Page
//		selPage.NavigateHome();
//	}

}
