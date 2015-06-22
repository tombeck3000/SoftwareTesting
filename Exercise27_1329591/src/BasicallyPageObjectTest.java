// Beck; 1329591; Exercise2-7

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Parameterized.class)
public class BasicallyPageObjectTest {
	
	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[100][0]);
	}
		
	private StringBuffer verificationErrors = new StringBuffer();
	public static WebDriver driver;
	CirulliHomePageObjects cirulliHomePage;
	
	@Before
	public void setUp() {
	    driver = new FirefoxDriver();
	    driver.navigate().to("http://gabrielecirulli.github.io/2048/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		cirulliHomePage = new CirulliHomePageObjects(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(cirulliHomePage.appNotice));
	}

	@Test
	public void testComparisonScoreAndBestAfterTwoMoves_ShouldBeTheSame() throws InterruptedException {
		cirulliHomePage.startNewGame();
		cirulliHomePage.arrowLeft();
		cirulliHomePage.arrowUp();
		assertEquals(cirulliHomePage.getBestScore(), cirulliHomePage.getActualScore());
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
