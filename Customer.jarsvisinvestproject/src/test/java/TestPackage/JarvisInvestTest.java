package TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Baseclass;
import BaseClasses.UtilityClass;
import PomPacklage.GetstartedPage;
import PomPacklage.SignUpPage;
import PomPacklage.SigninPage;

public class JarvisInvestTest extends Baseclass {
	Baseclass base;
	GetstartedPage page;
	SigninPage sign;
	SignUpPage Signup;
	
	
	@BeforeClass
	public void Browserlounch()
	{
		lounchBrowser();
		page=new GetstartedPage(driver);
		sign=new SigninPage(driver);
		Signup=new SignUpPage(driver);
	}
	@BeforeMethod
	public void ClickGetstartedButton() 
	{
		page.ClosePopup();
		page.ClickOnGetstartedButton();
	}
	@Test
	public void ClickSignUpButton() throws EncryptedDocumentException, IOException
	{
		sign.ClickOnSignUpButton();

		Signup.enterName("Ghodake yogesh sikandar");
		Signup.enterEmail("yogeshghodake1445@gmail.com");
	
		Signup.enterMobileNumber("9665657531");

		Signup.EnterPassword("Yogesh123");
	
	
	
		Signup.ClickOnotpButton();
	}
	@AfterClass
	public void browserclose()
	{
		CloseBrowser();
	}
	

}
