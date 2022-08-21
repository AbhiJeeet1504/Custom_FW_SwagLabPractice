package page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Locators {
	
	WebDriver driver= null;
	
	public Login_Page_Locators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user-name")
	private WebElement UserName;
	public WebElement getUserName()
	{
		return UserName;
	}
	
	@FindBy(name="password")
	private WebElement Password;
	public WebElement getPassword()
	{
		return Password;
	}
	
	
	
	
	
	@FindBy(id="login-button")
	private WebElement LoginButton;
	public WebElement getLoginButton()
	{
		return LoginButton;
	}
	
}
