package PomPacklage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	@FindBy(xpath="//a[text()=' Sign up']")private WebElement SignupButton;
	@FindBy(xpath="//input[@type='email']")private WebElement emailid;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//button[text()='Login']")private WebElement loginButton;
	public SigninPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSignUpButton()
	{
		SignupButton.click();
	}
	public void enterEmailid(String mail)
	{
		emailid.sendKeys(mail);
	}
	public void enterpass(String pass)
	{
		password.sendKeys(pass);
	}
	public void ClickOnloginButton()
	{
		loginButton.click();
	}
}
