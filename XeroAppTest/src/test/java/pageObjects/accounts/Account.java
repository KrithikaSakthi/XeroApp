package pageObjects.accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import modules.Module;
import utilities.ClickAction;
import utilities.LaunchApp;
import utilities.WebElements;

public class Account{

	public static void test(String[][] excelData) throws Exception {
		WebDriver driver;
		LaunchApp.extentReports("test-output/TC 10.html","TC 10");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();
		LaunchApp.waitTime(30);

		Module.signInAction(excelData,driver);
		
		//click on dashboard
		WebElement dashboard = driver.findElement(By.linkText("Dashboard"));
		ClickAction.clickButton(dashboard);
		
		//Hover over on Business
		WebElement Business = driver.findElement(By.xpath("//button[contains(text(),'Business')]"));
		ClickAction.getAction(Business);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Business')]"));
		ClickAction.clickButton(Business);
		Thread.sleep(4000);
		
		//Click on Purchase order
		WebElement bill = driver.findElement(By.linkText("Bills to pay"));
		ClickAction.clickButton(bill);
		
		WebElement paid = driver.findElement(By.xpath("//a[contains(text(),'Paid')]"));
		ClickAction.clickButton(paid);
		Thread.sleep(2000);
		
		WebElement repeating = driver.findElement(By.xpath("//a[@href='/AccountsPayable/SearchRepeating.aspx']"));
		ClickAction.clickButton(repeating);
		Thread.sleep(2000);
		
		WebElement Search = driver.findElement(By.xpath("//a[@href='/AccountsPayable/Search.aspx']"));
		ClickAction.clickButton(Search);
		
		LaunchApp.exitApplication();
	}

}
