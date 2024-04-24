package StepDefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import PageObjectModel.fableticslocator;
import PageObjectModel.gymsharkloator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class fableticslogin {
	
	WebDriver driver;
	@Given("user is in fabletics website")
	public void user_is_in_fabletics_website() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
//		long time=5;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		
		driver.get("https://www.fabletics.com");
//		Thread.sleep(4000);
		
	}
	
	@When("user click on body")
	public void user_click_on_body() throws InterruptedException {
		fableticslocator fbt=new fableticslocator(driver);
		fbt.clickonbody().click();
//		Thread.sleep(4000);

	}


	@And("user click the signin button") 
	public void user_click_the_signin_button() throws InterruptedException {
		fableticslocator fbt=new fableticslocator(driver);
		fbt.signinbtn().click();
//		Thread.sleep(4000);


	}

	@And("user enter an valid email address {string}")
	public void user_enter_an_valid_email_address(String string) throws InterruptedException {
		fableticslocator fbt=new fableticslocator(driver);
		fbt.email().sendKeys(string);
//		Thread.sleep(4000);
		
	}

	@And("user enter valid password {string}")
	public void user_enter_valid_password(String string) throws InterruptedException {
		fableticslocator fbt=new fableticslocator(driver);
		fbt.password().sendKeys(string);
//		Thread.sleep(4000);
		
	}

	@And("user will click the signin button")
	public void user_will_click_the_signin_button() throws InterruptedException {
		fableticslocator fbt=new fableticslocator(driver);
		fbt.SIGNINbtn().click();
//		Thread.sleep(4000);
	}

	@Then("user will be able to sign in fabletics")
	public void user_will_be_able_to_sign_in_fabletics() throws InterruptedException {
		fableticslocator fbt=new fableticslocator(driver);
		String Expected="SORT BY:";
		String Actual=fbt.HomepageSortby().getText();
		
		SoftAssert sft=new SoftAssert();
		sft.assertEquals(fbt.HomepageSortby().getText(),"SORT BY:","The Title match with the expected title");
		System.out.println("First assertion passed");
		
		sft.assertEquals(fbt.UserImplicit(), "Implicit","User name match with the expected user name");
		System.out.println("Second assertion passed" );
		
		fbt.EnableOption().click();
		Thread.sleep(6000);
		
//		fbt.Accesibility().getText();
		
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
		
		
//		driver.close();
//		sft.assertAll();
		
	}


}
