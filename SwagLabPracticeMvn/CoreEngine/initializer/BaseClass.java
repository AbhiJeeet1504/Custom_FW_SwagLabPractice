package initializer;

import dataSource.PropertyReader;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	protected static WebDriver driver= null;
	String propertyFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\config.properties";
	
	@BeforeMethod
	public void beforeEachMethod() throws IOException
	{
		System.out.println(propertyFilePath);
		driver = Initializer.createDriverInstance(PropertyReader.getPropertyValue(propertyFilePath, "browser"));
		driver.get(PropertyReader.getPropertyValue(propertyFilePath, "url"));
	}
	
	@AfterMethod
	public void afterEachMethod()
	{
		driver.quit();
	}
	
	
	
}