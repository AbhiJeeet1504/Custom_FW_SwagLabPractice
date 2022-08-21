package commonFunctionalities;

import org.openqa.selenium.WebElement;

public class buttonWebElement {

	public static void buttonClick(WebElement button)
	{
		if(commonWebElement.isClickable(button))
		{
			button.click();
		}
	}
}
