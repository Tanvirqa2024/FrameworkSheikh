package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import PageObjectModel.faceboosignuppage;
import PageObjectModel.gymsharkloator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GSharklogin {
	
	WebDriver driver;
	@Given("user is in gymshark website")
	public void user_is_in_gymshark_website() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gymshark.com/");
//		Thread.sleep(2000);
	}

	@When("user click the account button")
	public void user_click_the_account_button() throws InterruptedException {
		gymsharkloator GS =new gymsharkloator(driver);
		GS.accountbtn().click();
		Thread.sleep(2000);
		
	}

	@When("user enter valid email {string}")
	public void user_enter_valid_email(String string) throws InterruptedException {
		gymsharkloator GS =new gymsharkloator(driver);
		GS.email().sendKeys(string);
		Thread.sleep(2000);
	   	}

//	@When("user enter valid password {string}")
//	public void user_enter_valid_password(String string) throws InterruptedException {
//		gymsharkloator GS =new gymsharkloator(driver);
//	   GS.Password().sendKeys(string);
//	   Thread.sleep(2000);
//	}
	
	@When("user enter invalid password {string}")
	public void user_enter_invalid_password(String string) throws InterruptedException {
		gymsharkloator GS =new gymsharkloator(driver);
		GS.Password().sendKeys(string);
		Thread.sleep(2000);
	}

	@When("user click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		gymsharkloator GS =new gymsharkloator(driver);
	   GS.loginbtn().click();
	   Thread.sleep(8000);
	}
	
	@Then("user will not be able to log in")
	public void user_will_not_be_able_to_log_in() {
		
		gymsharkloator GS =new gymsharkloator(driver);
	String Expected="MY GYMSHARK";
	String Actual=GS.LoginHeader().getText();
	
	SoftAssert sft=new SoftAssert();
	sft.assertEquals( GS.LoginHeader().getText(),"MY GYMSHARK","The Title match with the expected one");
	System.out.println("First assertion passed");
	
	sft.assertEquals(GS.Wrongemailpw().getText(),"Wrong email or password.","The actual text match with the expected text");
	System.out.println("Second assertion passed");
	
	sft.assertTrue(GS.Imagebtn().isDisplayed());
	System.out.println("Third assertion passed");
	driver.close();
	sft.assertAll();
	
}
	   
	
//	@Then("user will be able to log in")
//	public void user_will_be_able_to_log_in(){
//		  driver.close();
//
//	}

	
//	@Then("user will be able to log in soft assertion")
//	public void user_will_be_able_to_log_in_soft_assertion(){
//		//to use soft assertion we need to create an Object of SoftAssert class
//		
//		gymsharkloator GS =new gymsharkloator(driver);
////		String Expected="YOUR GYMSHARK ACCOUNT";
////		String Actual=GS.HomePageHeader().getText();
//		// assertion (Actulal, Expected);
//		
//		SoftAssert sft=new SoftAssert();
//		sft.assertEquals( GS.HomePageHeader().getText(),"YOUR GYMSHARK ACCOUNT","The Header match with expected header");
//		System.out.println("First assertion passed");
//		
//		//                       ADDRESSBOOK
//		sft.assertEquals(GS.AddressBook().getText(),"ADDRESS BOOK");
//		System.out.println("Second assertion passed");
//		
//		sft.assertTrue(GS.btnReturn().isEnabled());
//		System.out.println("Third assertion passed");
//		driver.close();
//		sft.assertAll();
//		
//	}
	
}
