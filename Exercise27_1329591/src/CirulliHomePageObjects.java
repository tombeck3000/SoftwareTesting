// Beck; 1329591; Exercise2-7

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CirulliHomePageObjects {
		
	WebDriver pageDriver;
	
	public CirulliHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		pageDriver = driver;
	}
	
	
	@FindBy(className="grid-container")
	private WebElement gameBoard;
	
	@FindBy(css="div.score-container")
	private WebElement actualScore;
	
	@FindBy(css="div.best-container")
	private WebElement bestScore;
	
	@FindBy(className="restart-button")
	private WebElement newGameBtn;
	
	@FindBy(className="app-notice")
	public WebElement appNotice;
	
	public boolean startNewGame() {
		try {
			newGameBtn.click();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public void arrowLeft() {
		gameBoard.sendKeys(Keys.ARROW_LEFT);
	}
	
	public void arrowRight() {
		gameBoard.sendKeys(Keys.ARROW_RIGHT);
	}
	
	public void arrowUp() {
		gameBoard.sendKeys(Keys.ARROW_UP);
	}
	
	public void arrowDown() {
		gameBoard.sendKeys(Keys.ARROW_DOWN);
	}

	public String getActualScore() {
		String score = actualScore.getText();
		try {
			return score.substring(0, score.indexOf('+')).trim();
		} catch (Exception e) {
			return score;
		}
	}
	
	public String getBestScore() {
		return bestScore.getText();
	}
}