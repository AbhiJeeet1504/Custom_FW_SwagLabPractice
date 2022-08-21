package initializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initializer {

	public static WebDriver driver;

	static String chromeDriverPath = System.getProperty("user.dir")+"/src/Test/resources/Driver/chromedriver.exe";
	public String FFDriverPath="";
	
	public static WebDriver createDriverInstance(String browser) {
	
		switch(browser)	{
		
			case "chrome":
				System.setProperty("webdriver.chrome.driver",chromeDriverPath);
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				break;
		}		
				
		
		return driver;

		// WebDriver ffDriver = new FirefoxDriver();

	}

}
