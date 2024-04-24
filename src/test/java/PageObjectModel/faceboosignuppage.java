package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class faceboosignuppage {
private WebDriver driver;
	
	public faceboosignuppage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="firstname")
	WebElement firstname;
	public WebElement firstname() {
		return firstname;
	}
	
	@FindBy(name="lastname")
	WebElement Lastname;
	public WebElement Lastname() {
		return Lastname;
	}
	
	
	@FindBy(name="reg_email__")
	WebElement PhnNumberOrEmail;
	public WebElement PhnNumberOrEmail() {
		return PhnNumberOrEmail;
	}
	
	@FindBy(name="reg_passwd__")
	WebElement Password;
	public WebElement Password() {
		return Password;
	}
	
	@FindBy(name="birthday_month")
	WebElement Month;
	public WebElement Month() {
		return Month;
	}
	
	@FindBy(xpath="//select[@name=\"birthday_day\"]")
	WebElement Day;
	public WebElement Day() {
		return Day;
	}
	
	@FindBy(name="birthday_year")
	WebElement Year;
	public WebElement Year() {
		return Year;
	}
	
	@FindBy(xpath="//input[@value=\"2\"]")
	WebElement Male;
	public WebElement Male() {
		return Male;
	}
	
	@FindBy(xpath="//input[@value=\"1\"]")
	WebElement Female;
	public WebElement Female() {
		return Female;
	}
	
	@FindBy(xpath="//input[@value=\"-1\"]")
	WebElement Custom;
	public WebElement Custom() {
		return Custom;
	}
	
	@FindBy(name="websubmit")
	WebElement btnSignUp;
	public WebElement btnSignUp() {
		return btnSignUp;
	}
	
	
}