package pageObjects.orgPlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import utilities.ClickAction;
import utilities.LaunchApp;
import utilities.WebElements;

public class OrgTrail{

	public static void test(String[][] excelData) throws Exception {
		WebDriver driver;
		LaunchApp.extentReports("test-output/OrgTrail.html","OrgTrail");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();
		LaunchApp.waitTime(30);
		
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
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h2[@class='org-name']//a[contains(text(),'My Xero')]")).click();
		driver.findElement(By.xpath("//span[@class='right-arrow']")).click();
		driver.findElement(By.xpath("//a[@class='x-btn green']")).click();
		Thread.sleep(3000);
		
		//Add an organization
		driver.findElement(By.cssSelector("#text-1022-inputEl")).sendKeys("Self");
		driver.findElement(By.cssSelector("#cmbTimeZone-inputEl")).click();
		driver.findElement(By.xpath("//span[contains(text(),'(US')]")).click();
		driver.findElement(By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']")).sendKeys("Accounting");
		driver.findElement(By.xpath("//input[@id='combo-1029-inputEl']")).sendKeys("Accounting Practise");

		driver.findElement(By.linkText("Start Trial")).click();
		LaunchApp.getLogger().log(LogStatus.PASS, "Start Trail");
		
		LaunchApp.exitApplication();
	}

}
