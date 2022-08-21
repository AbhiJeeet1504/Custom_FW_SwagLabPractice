package page_Action;

import org.openqa.selenium.WebDriver;

import commonFunctionalities.TextboxWebElement;
import commonFunctionalities.buttonWebElement;
import page_Locators.Login_Page_Locators;

public class LoginPage_Action {
	WebDriver driver=null;
	Login_Page_Locators lpl=null;
	
	public LoginPage_Action(WebDriver driver)
	{
		this.driver=driver;
		lpl= new Login_Page_Locators(driver);
	}
	
	public void enterUserName(String user) {
		if(lpl.getUserName()!=null) {
			TextboxWebElement.sendText(lpl.getUserName(), user);	
		}
	}
	
	public void enterPassword(String pass) {
		if(lpl.getPassword()!=null) {
			TextboxWebElement.sendText(lpl.getPassword(), pass);
		}
	}
	
	/*
	 * public void enterConfPassword(String confpass) { if(lpl.getConfPass()!=null)
	 * { TextboxWebElement.sendText(lpl.getConfPass(), confpass); } }
	 */
	
	public void clickLoginButton() {
		buttonWebElement.buttonClick(lpl.getLoginButton());
	}
	
	public void loginPageAction(String userName, String Passwrd) {
		enterUserName(userName);
		enterPassword(Passwrd);
		clickLoginButton();
	}
	
}
