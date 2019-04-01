package pageObjects.logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import modules.Module;
import utilities.ClickAction;
import utilities.LaunchApp;
import utilities.WebElements;

public class Logout{

	public static void test(String[][] excelData) throws Exception {
		WebDriver driver;
		LaunchApp.extentReports("test-output/Logout.html","Logout");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();
		
		LaunchApp.waitTime(30);

		Module.signInAction(excelData,driver);
		//click on dashboard
		WebElement dashboard = driver.findElement(By.linkText("Dashboard"));
		ClickAction.clickButton(dashboard);
		Thread.sleep(3000);
		
		//Hover over on User name
		WebElement KS = driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-1']"));
		ClickAction.getAction(KS);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-1']"));
		ClickAction.clickButton(KS);
		Thread.sleep(2000);
		
		WebElement logOut = driver.findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]"));
		ClickAction.clickButton(logOut);
		LaunchApp.getLogger().log(LogStatus.PASS, "Logged out of the application");
		
		LaunchApp.exitApplication();
	}

}
