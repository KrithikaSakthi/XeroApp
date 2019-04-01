package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;
import utilities.ExcelData;
import utilities.ClickAction;
import utilities.LaunchApp;
import utilities.WebElements;

public class Module {
	
	
	public static void signInAction(String[][] excelData, WebDriver driver) throws Exception{
		
		
	WebElement loginPage = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
	ClickAction.clickButton(loginPage);
	//enter email address
	WebElement username = driver.findElement(By.id("email"));
	WebElements.enterText(username, excelData[1][1]);
	LaunchApp.getLogger().log(LogStatus.PASS, " Username Entered");

	//enter the password
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	WebElements.enterText(password, excelData[1][2]);
	LaunchApp.getLogger().log(LogStatus.PASS, "password Entered");
	
	//click login
	WebElement login = driver.findElement(By.id("submitButton"));
	ClickAction.clickButton(login);
	LaunchApp.getLogger().log(LogStatus.PASS, "Logged in");
	}


}
