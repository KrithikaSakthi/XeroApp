package pageObjects.login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;
import modules.Module;
import utilities.ClickAction;
import utilities.LaunchApp;
import utilities.WebElements;

public class ValidLogin {

	public static void test(String[][] excelData) throws Exception {
		WebDriver driver;
		LaunchApp.extentReports("test-output/ValidLogin.html","ValidLogin");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();
		
		LaunchApp.waitTime(30);
		
		Module.signInAction(excelData,driver);
		
		/*//click on dashboard
		WebElement dashboard = driver.findElement(By.linkText("Dashboard"));
		ClickAction.clickButton(dashboard);*/

		LaunchApp.exitApplication();
	}

	
}
