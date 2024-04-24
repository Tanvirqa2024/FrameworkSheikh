package StepDefinations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.BestBuysigninPage;
import PageObjectModel.gymsharkloator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BestBuysignin {
	WebDriver driver;
	
	@Given("user is in Best Buy Website")
	public void user_is_in_best_buy_website() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.com/");
		Thread.sleep(2000);
	}
	
	
	@When("user click the Account button")
	public void user_click_the_account_button() throws InterruptedException {
		BestBuysigninPage BBP=new BestBuysigninPage (driver);
		BBP.accountbtn().click();
		Thread.sleep(2000);
	}

	@And("user click the sign in button")
	public void user_click_the_sign_in_button() throws InterruptedException {
		BestBuysigninPage BBP=new BestBuysigninPage (driver);
		BBP.signin().click();
		Thread.sleep(2000);
	}

	@And("user enter valid email address {string}")
	public void user_enter_valid_email_address(String string) throws InterruptedException {
		BestBuysigninPage BBP=new BestBuysigninPage (driver);
		BBP.Email().sendKeys(string);
		Thread.sleep(2000);
	}
	
	@And("user enter a valid password {string}")
	public void user_enter_a_valid_password(String string) throws InterruptedException {
		BestBuysigninPage BBP=new BestBuysigninPage (driver);
		BBP.Password().sendKeys(string);
		Thread.sleep(2000);

	}
	

	@And("user click Sign in button")
	public void user_click_sign_in_button() throws InterruptedException {
		BestBuysigninPage BBP=new BestBuysigninPage (driver);
		BBP.Signin().click();
		Thread.sleep(2000);

	}

	@Then("user will be able to sign in Best Buy")
	public void user_will_be_able_to_sign_in_best_buy() {
		BestBuysigninPage BBP=new BestBuysigninPage (driver);
		String Expected="Today's top picks";
		String Actual=BBP.TodaysTopPicks().getText();
		
		assertEquals(Expected,Actual);
		assertEquals ("Today's top picks",BBP.TodaysTopPicks().getText());
		driver.close();

	}
	

//	@Then("user will be able to log in")
//	public void user_will_be_able_to_log_in() {
//		BestBuysigninPage BBP=new BestBuysigninPage (driver);
//		String Expected="YOUR GYMSHARK ACCOUNT";
//		String Actual=GS.HomePageHeader().getText();
//		
//		assertEquals(Expected,Actual);
//		//assertNotequal
//		assertEquals("ADDRESS BOOK",GS.AddressBook().getText());
//		
//		assertTrue(GS.btnReturn().isEnabled());
//		//assertFalse
//		//assertNull
//		
//		driver.close();
		
		
		
	}

