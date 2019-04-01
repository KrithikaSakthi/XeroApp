package pageObjects.freeTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ClickAction;
import utilities.LaunchApp;
import utilities.WebElements;

public class SignUP{

	
	public static void test(String[][] excelData) throws Exception {
		WebDriver driver;
		LaunchApp.extentReports("test-output/SignUp.html","SignUp");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();
		
		LaunchApp.waitTime(30);
	
		WebElement trial = driver.findElement(By.linkText("Free trial"));
		ClickAction.clickButton(trial);
		LaunchApp.getLogger().log(LogStatus.PASS, " entered into Free trial page");
		
		//enter first name
		WebElement firstName = driver.findElement(By.xpath("//input[@name='FirstName']"));
		WebElements.enterText(firstName, "aaa");
		//enter last name
		WebElement lastName = driver.findElement(By.xpath("//input[@name='LastName']"));
		WebElements.enterText(lastName, "bbb");
		
		//enter email address
		WebElement email = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		WebElements.enterText(email, "abc@gmail.com");
		
		//enter phone no
		WebElement phoneNo = driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		WebElements.enterText(phoneNo , "1234");
		
		//select country
		Select select = new Select(driver.findElement(By.xpath("//select[@name='LocationCode']")));
		select.selectByVisibleText("United States");
		
		//check the terms and conditions
		WebElement terms = driver.findElement(By.xpath("//input[@value='true']"));
		ClickAction.clickButton(terms);
		LaunchApp.getLogger().log(LogStatus.PASS, "Registration details entered");
		
		WebElement submit = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		ClickAction.clickButton(submit);
		LaunchApp.getLogger().log(LogStatus.PASS, "Getting started");
		
		LaunchApp.exitApplication();
	}

}
