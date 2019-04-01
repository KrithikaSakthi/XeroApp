package pageObjects.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ClickAction;
import utilities.LaunchApp;
import utilities.WebElements;

public class ForgotPswd {

	public static void test(String[][] excelData) throws Exception {
		
		WebDriver driver;
		LaunchApp.extentReports("test-output/ForgotPswd.html","ForgotPswd");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();
		
		LaunchApp.waitTime(30);
		
		LaunchApp.extentReports("test-output/ForgotPswd.html","ForgotPswd");


		WebElement loginPage = driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		ClickAction.clickButton(loginPage);
		//enter email address
		WebElement username = driver.findElement(By.id("email"));
		WebElements.enterText(username, excelData[1][1]);
		LaunchApp.getLogger().log(LogStatus.PASS, " Username Entered ");
		
		//forgot password
		WebElement fgtPswd = driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
		ClickAction.clickButton(fgtPswd);
		LaunchApp.getLogger().log(LogStatus.PASS, " Forgot password clicked");
		
		Thread.sleep(5000);
		
		WebElement username1 = driver.findElement(By.xpath("//input[@id='UserName']"));
		WebElements.enterText(username1, excelData[1][1]);
		
		WebElement text = driver.findElement(By.xpath("//span[contains(@class,'text')]"));
		ClickAction.clickButton(text);

		LaunchApp.exitApplication();

	}

}
