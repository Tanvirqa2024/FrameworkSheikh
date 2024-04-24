package StepDefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.RunSignupPage;
import PageObjectModel.faceboosignuppage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RunSignup {
	WebDriver driver;
	@Given("user is in Run signup page")
	public void user_is_in_Run_signup_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://runsignup.com/CreateAccount?redirect=%2F");
		Thread.sleep(3000);
	}
	

	@When("user enter firstname {string} and lastname {string}")
	public void user_enter_firstname_and_lastname(String FirstName, String LastName) throws InterruptedException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		RunPage.firstname().sendKeys(FirstName);
		RunPage.Lastname().sendKeys(LastName);
		Thread.sleep(3000);
	}

	@And("user enter valid Email {string}")
	public void user_enter_valid_email(String string) throws InterruptedException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		RunPage.Email().sendKeys(string);
		Thread.sleep(3000);
	}

	@And("user enter valid Password {string}")
	public void user_enter_valid_password(String string) throws InterruptedException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		RunPage.Password().sendKeys(string);
		Thread.sleep(3000);
	}

	@And("user enter Address {string}")
	public void user_enter_address(String string) throws InterruptedException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		RunPage.Address().sendKeys(string);
		Thread.sleep(3000);
	}

	@And("user enter Zip Code {string}")
	public void user_enter_zip_code(String string) throws InterruptedException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		RunPage.ZipCode().sendKeys(string);
		Thread.sleep(3000);
	}

	@And("user enter City {string}")
	public void user_enter_city(String string) throws InterruptedException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		RunPage.City().sendKeys(string);
		Thread.sleep(3000);
	}

	@And("user select Country {string}")
	public void user_select_country(String string) throws InterruptedException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		Select sel=new Select(RunPage.Country());
		sel.selectByValue(string);
		Thread.sleep(3000);
	}

	@And("user enter DOB {string}")
	public void user_enter_dob(String string) throws InterruptedException, AWTException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		RunPage.DOB().sendKeys(string);
		Thread.sleep(3000);
		
	}

	@And("user enter Phone Number {string}")
	public void user_enter_phone_number(String string) throws InterruptedException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		RunPage.PhoneNumber().sendKeys(string);
		Thread.sleep(3000);
	}

	@And("user select Gender {string}")
	public void user_select_gender(String string) throws InterruptedException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		Select Gen=new Select(RunPage.Gender());
		Gen.selectByValue(string);
		
		Thread.sleep(3000);
	}

	@And("user click Check Box")
	public void user_click_check_box() throws InterruptedException {
		RunSignupPage RunPage=new RunSignupPage(driver);
		RunPage.CheckBox().click();
		Thread.sleep(3000);

	}
	
	@And("user click CrtAcntBtn")
	public void user_click_crt_acnt_btn() throws InterruptedException, AWTException {
		RunSignupPage RunPage=new RunSignupPage(driver);
//		Robot rb=new Robot();
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
		RunPage.CrtAcntBtn().click();
		
		
		
	}
	
	
	
	
//	@And("user click CrtAcntBtn")
//	public void user_click_crt_acnt_btn() throws InterruptedException {
//		RunSignupPage RunPage=new RunSignupPage(driver);
//		RunPage.CrtAcntBtn().click();
//		Thread.sleep(3000);

//	}
	
	@Then("user able to Create Account")
	public void user_able_to_create_account() {
	   
	}

}