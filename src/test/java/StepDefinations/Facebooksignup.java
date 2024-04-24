package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.faceboosignuppage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebooksignup {
	WebDriver driver;
	@Given("user is in facebook signup page")
	public void user_is_in_facebook_signup_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg/");
		Thread.sleep(3000);
	}

	@When("user enter firstname {string} and last name {string}")
	public void user_enter_firstname_and_last_name(String FirstName, String LastName) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.firstname().sendKeys(FirstName);
		FBpage.Lastname().sendKeys(LastName);
		//Thread.sleep(3000);
	}

	@And("user enter Phone number {string}")
	public void user_enter_phone_number(String string) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.PhnNumberOrEmail().sendKeys(string);
		//Thread.sleep(3000);
	}

	@And("user enter Password {string}")
	public void user_enter_password(String string) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.Password().sendKeys(string);
		//Thread.sleep(3000);
	    
	}
		
	
	@And("user select DOB Month {string} and {string} and {string}") 
	public void user_select_dob_month_and_and(String Month, String Day, String Year) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		Select sel1=new Select(FBpage.Day());
		sel1.selectByValue(Day);
		
		Select sel2=new Select(FBpage.Month());
		sel2.selectByVisibleText(Month);
		
		Select sel3=new Select(FBpage.Year());
		sel3.selectByValue(Year);
		//Thread.sleep(3000);

	}

	
	
	@And("user click Gender {string}")
	public void user_click_gender(String Gender) throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		
		
		Thread.sleep(3000);
		if(Gender.equals("Male")) {
			FBpage.Male().click();
			
		}
	 else if(Gender.equals("Female")){
			FBpage.Female().click();
		}
		
	 else {FBpage.Custom().click();
		 
	 }

	}

	@And("user click signup button")
	public void user_click_signup_button() throws InterruptedException {
		faceboosignuppage FBpage=new faceboosignuppage(driver);
		FBpage.btnSignUp().click();
		//Thread.sleep(3000);
	}
	

	@Then("user able to signup")
	public void user_able_to_signup() {
	    driver.close();
	}
	
	@Then("user not able to signup")
	public void user_not_able_to_signup() {
		
	}

}


