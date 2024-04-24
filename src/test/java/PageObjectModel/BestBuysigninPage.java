package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestBuysigninPage {
	
	public WebDriver driver;
	
	public BestBuysigninPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[@class=\"v-p-right-xxs line-clamp\"]")
	WebElement accountbtn;
	public WebElement accountbtn() {
		return accountbtn;
	}
	
	@FindBy(xpath="//a[@class=\"c-button c-button-secondary c-button-sm sign-in-btn\"]")
	WebElement signin;
	public WebElement signin() {
		return signin;
	}
	
	@FindBy(name="fld-e")
	WebElement Email;
	public WebElement Email() {
		return Email;
	}
	
	@FindBy(name="fld-p1")
	WebElement Password;
	public WebElement Password() {
		return Password;
	}
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement Signin;
	public WebElement Signin() {
		return Signin;	
	}
	
	@FindBy (xpath="//h2[@class=\"nba-section-title mb-150 lv\"]")
	WebElement TodaysTopPicks;
	public WebElement TodaysTopPicks() {
		return TodaysTopPicks;	
	}
	
}