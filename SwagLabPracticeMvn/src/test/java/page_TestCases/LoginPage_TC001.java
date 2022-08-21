package page_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import dataSource.PropertyReader;
import initializer.BaseClass;
import page_Action.LoginPage_Action;

public class LoginPage_TC001 extends BaseClass{
	
	public String propertyFilePath = System.getProperty("user.dir")+"/src/test/resources/TestData/config.properties";
	
	
	@Test
	public void loginWithValidCredentials() throws IOException
	{
		LoginPage_Action loginPA= new LoginPage_Action(driver);
		
		loginPA.loginPageAction(PropertyReader.getPropertyValue(propertyFilePath, "userName"),
				PropertyReader.getPropertyValue(propertyFilePath, "Password"));
	}

}
