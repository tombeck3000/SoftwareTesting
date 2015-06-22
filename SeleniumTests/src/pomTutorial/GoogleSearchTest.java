package pomTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) throws InterruptedException {
		
		driver.navigate().to("http://www.google.com");
		
		// Object for the page
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		//Search for Selenium
		page.SearchGoogle("Selenium");
		
		//Click the Selenium Web Site link, will return the Selenium Web Site
		SeleniumPageObjects selPage = page.ClickSelenium();
		
		//Wait for the Page to load
		Thread.sleep(5000);
		
		//Click Download Tab
		selPage.ClickDownloads();
		
		//Navigate Home Page
		selPage.NavigateHome();
	}

}
