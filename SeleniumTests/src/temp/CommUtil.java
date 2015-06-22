package temp;

import java.util.concurrent.TimeUnit;

public class CommUtil {
	public static boolean implicitWait(long time) {
		try {
			Driver.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			System.out.println("Waited for " + time + " seconds implicitly.");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static boolean launchBrowser(String url) {
		try {
			Driver.driver.get(url);
			Driver.driver.manage().window().maximize();
			System.out.println("Browser launched successfully");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
