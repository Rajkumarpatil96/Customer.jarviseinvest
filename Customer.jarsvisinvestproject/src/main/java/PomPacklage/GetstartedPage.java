package PomPacklage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetstartedPage {
	
	@FindBy(xpath="(//button[@type='button'])[3]")private WebElement GetstartedButton;
	@FindBy(xpath="//span[text()='Close']")private WebElement hiddenpopup;
	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement Signin;

	public GetstartedPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void ClosePopup()
	{
		hiddenpopup.click();
	}
	public void ClickOnGetstartedButton() 
	{

		GetstartedButton.click();
	}
	public void clicksignInButton()
	{
	Signin.click();
	}
	
}
