package PomPacklage;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public  class SignUpPage {

		@FindBy(xpath="//input[@type='text']")private WebElement name;
		@FindBy(xpath="//input[@type='email']")private WebElement email;
		@FindBy(xpath="//input[@type='number']")private WebElement mobileNumber;
		@FindBy(xpath="//input[@type='password']")private WebElement  passWord;
		@FindBy(xpath="(//button[@type='button'])[1]")private WebElement otpbutton;
		@FindBy(xpath="//a[text()=' Sign In']")private WebElement signinbutton;
		 public SignUpPage(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		 }
		 public void enterName(String name1)
		 {
			name.sendKeys(name1); 
		 } 
		 public void enterEmail(String Email1)
		 {
			 email.sendKeys(Email1);
		 }
		 public void enterMobileNumber(String no)
		 {
			 mobileNumber.sendKeys(no);
		 }
		 public void EnterPassword(String pass)
		 {
			 passWord.sendKeys(pass);
		 }
		 public void ClickOnotpButton()
		 {
			 otpbutton.click();
		 }
			public void ClickonsigninButton()
			{
				signinbutton.click();
			}
		

	}


