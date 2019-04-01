package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class WebElements extends LaunchApp{

	
	
	public static WebElement findElement(int x, String path) throws Exception {
		WebElement element = null;
		
		switch(x)
		{
		case 1:
			element = driver.findElement(By.id(path));
			break;
		case 2:
			element = driver.findElement(By.xpath(path));
			break;
		case 3:
			element = driver.findElement(By.cssSelector(path));
			break;
		case 4:
			element = driver.findElement(By.className(path));
			break;
		case 5:
			element = driver.findElement(By.name(path));
			break;
		case 6:
			element = driver.findElement(By.linkText(path));
			break;
		case 7:
			element = driver.findElement(By.partialLinkText(path));
			break;
		case 8:
			element = driver.findElement(By.tagName(path));
			break;
		}
		return element;
		
	}	
	
	public static void enterText( WebElement obj , String textValue) throws InterruptedException
	{	
		
		if(obj.isDisplayed())
		{
			Thread.sleep(2000);
			obj.sendKeys(textValue);
			System.out.println("Enter into text field is success");
			
		}
		else
		{
			System.out.println("It doesnt exist please check");
			
		}
	}

}
