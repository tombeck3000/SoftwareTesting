package temp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	public static WebDriver driver = new FirefoxDriver();
	public static WebDriver browser(String browser) {
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}else if (browser.equalsIgnoreCase("ghost")) {
				
			}
		} catch (Exception e) {
			return null;
		}
		return driver;
	}
}
