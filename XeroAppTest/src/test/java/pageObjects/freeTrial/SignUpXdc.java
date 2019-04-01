package pageObjects.freeTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ClickAction;
import utilities.LaunchApp;
import utilities.WebElements;

public class SignUpXdc {

	public static void test(String[][] excelData) throws Exception {
		WebDriver driver;
		LaunchApp.extentReports("test-output/SignupXdc.html","SignupXdc");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();	
		LaunchApp.waitTime(30);
		
		WebElement trial = driver.findElement(By.linkText("Free trial"));
		ClickAction.clickButton(trial);
		LaunchApp.getLogger().log(LogStatus.PASS, " entered into Free trial page");
		
		WebElement submit = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		ClickAction.clickButton(submit );
		LaunchApp.getLogger().log(LogStatus.PASS, " Submit");
		
		WebElement username = driver.findElement(By.name("EmailAddress"));
		WebElements.enterText(username, excelData[1][1]);
		LaunchApp.getLogger().log(LogStatus.PASS, " Username Entered");
		
		WebElement submit1 = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		ClickAction.clickButton(submit1);
		LaunchApp.getLogger().log(LogStatus.PASS, " Submit");
		
		driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']")).click();
		
		LaunchApp.exitApplication();

	}

}
