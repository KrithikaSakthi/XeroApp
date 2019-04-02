package pageObjects.freeTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ClickAction;
import utilities.LaunchApp;

public class SignUpPrivacy{

	public static void test(String[][] excelData) throws Exception {
		WebDriver driver;
		LaunchApp.extentReports("SignupPrivacy");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();	
		LaunchApp.waitTime(30);

		WebElement free = driver.findElement(By.linkText("Free trial"));
		ClickAction.clickButton(free);
		LaunchApp.getLogger().log(LogStatus.PASS, " entered into Free trial page");
		
		WebElement terms = driver.findElement(By.linkText("terms of use"));
		ClickAction.clickButton(terms);
		LaunchApp.getLogger().log(LogStatus.PASS, "terms of use link opened");
	
		WebElement privacy = driver.findElement(By.linkText("privacy notice"));
		ClickAction.clickButton(privacy);
		LaunchApp.getLogger().log(LogStatus.PASS, "privacy notice link opened");
		
		LaunchApp.exitApplication();
		
	}

}
