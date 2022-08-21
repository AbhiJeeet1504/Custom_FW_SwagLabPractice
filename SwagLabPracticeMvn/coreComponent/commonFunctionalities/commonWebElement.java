package commonFunctionalities;

import org.openqa.selenium.WebElement;

public class commonWebElement {

	public static boolean isPresent(WebElement element)
	{
		boolean isDisplay= false;
		if(element.isDisplayed()==true)
		{
			isDisplay= true;
		}
		return isDisplay;
	}
	
	public static boolean isClickable(WebElement element)
	{
		boolean isClick= false;
		if(isPresent(element))
		{ 
			if(element.isEnabled()==true)
			{
				isClick = true;
			}
		}
		
		return isClick;
	}
}
