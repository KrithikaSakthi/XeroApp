package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClickAction extends LaunchApp{

	/* 
	 * Name of the Method  : clickButton()
	 * Description         : clicking the button
	 * Arguments           : webElement element
	 * Created 			   : 03/21/19
	 * Last Modified       : 03/31/19
	 */
	
	public static void clickButton(WebElement element) throws InterruptedException
	{
		if(element.isDisplayed())
		{
			Thread.sleep(2000);
			element.click();
			System.out.println("Element is clicked successfully");

		}else
		{
			System.out.println("Unable to find the button");

		}

	}

	/* 
	 * Name of the Method  : getAction()
	 * Description         : performing action
	 * Arguments           : webElement obj
	 * Created 			   : 03/21/19
	 * Last Modified       : 03/31/19
	 */
	public static Actions getAction(WebElement obj) {
		Actions action = new Actions(driver);
		action.moveToElement(obj).build().perform();
		return action;
	}
	
	/* 
	 * Name of the Method  : dropElement()
	 * Description         : selecting the values from dropdown
	 * Arguments           : webElement obj
	 * 					     int y
	 * 						 String index
	 * Created 			   : 03/21/19
	 * Last Modified       : 03/21/19
	 */
	public static Select dropElement(WebElement obj,int y, String index)
	{
		Select select = new Select(obj);
		
		switch(y)
		{
		case 1:
			select.selectByIndex(Integer.valueOf(index));
			break;			
		case 2:
			select.selectByValue(index);
			break;
		case 3:
			select.selectByVisibleText(index);
			break;
		}
		return select;
		
	}
}
