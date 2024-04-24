package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RunSignupPage {
private WebDriver driver;
	
	public RunSignupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="firstName")
	WebElement firstname;
	public WebElement firstname() {
		return firstname;
	}
	
	@FindBy(name="lastName")
	WebElement Lastname;
	public WebElement Lastname() {
		return Lastname;
	}
	
	
	@FindBy(id="email")
	WebElement Email;
	public WebElement Email() {
		return Email;
	}
	
	@FindBy(id="password")
	WebElement Password;
	public WebElement Password() {
		return Password;
	}
	
	@FindBy(id="address1")
	WebElement Address;
	public WebElement Address() {
		return Address;
	}
	
	@FindBy(id="zipcode")
	WebElement ZipCode;
	public WebElement ZipCode() {
		return ZipCode;
	}
	
	@FindBy(id="city")
	WebElement City;
	public WebElement City() {
		return City;
	}
	
	@FindBy(name="country")
	WebElement Country;
	public WebElement Country() {
		return Country;
	}
	
	@FindBy(xpath="//input[@id=\"dob\"]")
	WebElement DOB;
	public WebElement DOB() {
		return DOB;
	}
	
	@FindBy(name="phone")
	WebElement PhoneNumber;
	public WebElement PhoneNumber() {
		return PhoneNumber;
	}
	
	@FindBy(id="genderOptions")
	WebElement Gender;
	public WebElement Gender() {
		return Gender;
	}
	
	
	@FindBy(xpath="//span[@class=\"fauxcheckbox\"]")
	WebElement CheckBox;
	public WebElement CheckBox() {
		return CheckBox;
	}

	
	@FindBy(xpath=("//*[@id=\"createAccountFormContainer\"]/div/div/form/div[8]/button"))
	WebElement CrtAcntBtn;
	public WebElement CrtAcntBtn() {
		return CrtAcntBtn;
	}
	
}