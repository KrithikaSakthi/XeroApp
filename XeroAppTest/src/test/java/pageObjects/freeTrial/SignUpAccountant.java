package pageObjects.freeTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ClickAction;
import utilities.LaunchApp;

public class SignUpAccountant{

	public static void test(String[][] excelData) throws Exception {
		WebDriver driver;
		LaunchApp.extentReports("test-output/SignupAccountant.html","SignupAccountant");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();	
		LaunchApp.waitTime(30);

		WebElement free = driver.findElement(By.linkText("Free trial"));
		ClickAction.clickButton(free);
		LaunchApp.getLogger().log(LogStatus.PASS, " entered into Free trial page");
		
		WebElement book = driver.findElement(By.linkText("accountant or bookkeeper"));
		ClickAction.clickButton(book);
		LaunchApp.getLogger().log(LogStatus.PASS, "Accountant page opened");
		
		LaunchApp.exitApplication();

	}

}
