	package PageObjectModel;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class fableticslocator {
		
		public WebDriver driver;
		
		public fableticslocator(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		

		@FindBy(xpath="//body[@class=\"INDlangdirLTR INDpositionLeft INDDesktop INDChrome INDhasDragTooltip\"]")
		WebElement clickonbody;
		public WebElement clickonbody() {
			return clickonbody;
		}
		
		@FindBy(xpath="//span[@class=\"LoginLabel__PreSignin-sc-1far34g-0 bpCaTE\"]")
		WebElement signinbtn;
		public WebElement signinbtn() {
			return signinbtn;
		}
		
		@FindBy(name="email")
		WebElement email;
		public WebElement email() {
			return email;
		}
		
		@FindBy(name="password")
		WebElement password;
		public WebElement password() {
			return password;
		}
		
		@FindBy(xpath="//button[@class=\"Button__ButtonElement-sc-ffozwa-0 biXYBJ LoginForm__LoginButton-sc-8igvbv-2 bIrFaw\"]")
		WebElement SIGNINbtn;
		public WebElement SIGNINbtn() {
			return SIGNINbtn;
			
		}
		
		@FindBy(xpath="//span[@class=\"BuilderText__Text-sc-y20fn1-0 MGgik builder-block builder-c3b2d42203ef4115a62afdd24f46e3c7 builder-has-component css-12s6tey\"]")
		WebElement HomepageSortby;
		public WebElement HomepageSortby() {
			return HomepageSortby;
			
		}
		
		@FindBy(xpath="//span[@class=\"AccountGreeting__Callout-sc-1bvruso-0\"]")
		WebElement UserImplicit;
		public WebElement UserImplicit() {
			return UserImplicit;
		
		}
		
		@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[1]/footer/div[1]/ul/li[2]/ul/li[2]/div/ul/li[7]/button/span")
		WebElement EnableOption;
		public WebElement EnableOption() {
			return EnableOption;
	}
		
		@FindBy(xpath="//h2[@id=\"INDmenu-heading\"]")
		WebElement Accesibility;
		public WebElement Accesibility() {
			return Accesibility;
	}
	
		
}