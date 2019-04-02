package pageObjects.tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import modules.Module;
import utilities.ClickAction;
import utilities.LaunchApp;
import utilities.WebElements;

public class Tab{

	public static void test(String[][] excelData) throws Exception {
		WebDriver driver;
		LaunchApp.extentReports("tab");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();
		LaunchApp.waitTime(30);


		Module.signInAction(excelData,driver);
		
		//Hover over on accounts page
		WebElement user = driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
		ClickAction.getAction(user);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Accounting')]")).click();
		Thread.sleep(2000); 
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(4000);
		LaunchApp.getLogger().log(LogStatus.PASS, "Clicked on Reports");
		
		//Hover over on contacts page
		WebElement contacts = driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
		ClickAction.getAction(contacts);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Contacts')]")).click();
		Thread.sleep(4000);
		
		//Hover over on abc page
		WebElement abc = driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		ClickAction.getAction(abc);
		driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(4000);
		
		//Hover over on abc page
		WebElement abc1 = driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		ClickAction.getAction(abc1);
		driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']")).click();		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Files')]")).click(); 
		Thread.sleep(4000);
		
		//Hover over on + page
		WebElement plus = driver.findElement(By.xpath("//button[@title='Create new']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		ClickAction.getAction(plus);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Create new']//div[@class='xrh-focusable--child xrh-iconwrapper']")).click();
		Thread.sleep(4000);
		
		//Hover over on search page
		WebElement search = driver.findElement(By.xpath("//button[@title='Search']//*[@class='xrh-icon xrh-icon-svg']"));
		ClickAction.getAction(search);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Search']//*[@class='xrh-icon xrh-icon-svg']")).click();
		LaunchApp.getLogger().log(LogStatus.PASS, "hover over on search");
		Thread.sleep(4000);
		
		//Hover over on notifications page
		WebElement notify = driver.findElement(By.xpath("//button[@title='Notifications']"));
		ClickAction.getAction(notify);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Notifications']")).click();
		LaunchApp.getLogger().log(LogStatus.PASS, "hover over on +");
		Thread.sleep(4000);
	
		
		//Hover over on help page
		WebElement help = driver.findElement(By.xpath("//button[@title='Help']//*[@class='xrh-icon xrh-icon-svg']"));
		ClickAction.getAction(help);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Help']//*[@class='xrh-icon xrh-icon-svg']")).click();
		LaunchApp.getLogger().log(LogStatus.PASS, "hover over on help");
		LaunchApp.exitApplication();

	}

}
