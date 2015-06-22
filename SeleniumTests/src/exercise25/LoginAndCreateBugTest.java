// Beck; 1329591; Exercise2-4

package exercise25;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAndCreateBugTest {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://192.168.0.15/";
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @Test
  public void testLoginAndCreateBug() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("login_link_top")).click();
    driver.findElement(By.id("Bugzilla_login_top")).clear();
    driver.findElement(By.id("Bugzilla_login_top")).sendKeys("admin");
    driver.findElement(By.id("Bugzilla_password_top")).clear();
    driver.findElement(By.id("Bugzilla_password_top")).sendKeys("admin");
    driver.findElement(By.id("log_in_top")).click();
    assertEquals("http://192.168.0.15/index.cgi", driver.getCurrentUrl());
    driver.findElement(By.linkText("Neu")).click();
    driver.findElement(By.name("short_desc")).clear();
    driver.findElement(By.name("short_desc")).sendKeys("seleniumBug");
    driver.findElement(By.id("comment")).clear();
    driver.findElement(By.id("comment")).sendKeys("Bug for a selenium Test");
    driver.findElement(By.id("commit")).click();
    //Issue for exception with isDisplayed()-method: https://code.google.com/p/selenium/issues/detail?id=1880
    try {
		assertFalse(driver.findElement(By.id("log_in_top")).isDisplayed());
	} catch (NoSuchElementException e) {
		assertFalse(false);
	}
    assertEquals("http://192.168.0.15/post_bug.cgi", driver.getCurrentUrl());
    assertEquals("seleniumBug", driver.findElement(By.id("short_desc_nonedit_display")).getText());
    assertEquals("Bug for a selenium Test", driver.findElement(By.id("comment_text_0")).getText());
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
