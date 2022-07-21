package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Baseclass;
import PomPacklage.GetstartedPage;
import PomPacklage.SigninPage;

public class Testclass extends Baseclass {
	GetstartedPage get;
	SigninPage sig;
	@BeforeClass
	public void browserlounch()
	{
		lounchBrowser();
		sig=new SigninPage(driver);
		get=new GetstartedPage(driver);
	}
	@BeforeMethod
	public void clickOnsigninButton()
	
	{
		get.ClosePopup();
		get.clicksignInButton();
	}
	@Test
	public void entermailpass()
	{
		sig.enterEmailid("yogeshghodake1445@gmail.com");
		sig.enterpass("Yogesh123");
	}
	@AfterMethod
	public void clickonlogin()
	{
		sig.ClickOnloginButton();
	}
	@AfterClass
	public void Browserclose()
	{
		CloseBrowser();
	}
}
