package commonFunctionalities;

import org.openqa.selenium.WebElement;

public class TextboxWebElement {

	public static void sendText(WebElement textBox, String textToEnter)
	{
		if(commonWebElement.isClickable(textBox))
		{
			textBox.sendKeys(textToEnter);
		}
	}
	public static void clearText(WebElement textBox)
	{
		if(commonWebElement.isClickable(textBox))
		{
			textBox.clear();
		}
	}
	
}
