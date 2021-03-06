package pageObjects.uploadImage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;
import utilities.ExcelData;
import modules.Module;
import utilities.ClickAction;
import utilities.LaunchApp;
import utilities.WebElements;

public class UploadImage{
	
	

	public static void test(String[][] excelData) throws Exception {
		
		WebDriver driver;
		LaunchApp.extentReports("UploadImage");
		LaunchApp.startApplication();
		driver = LaunchApp.getDriver();
		LaunchApp.waitTime(30);

		Module.signInAction(excelData,driver);
		
		//Hover over on User name
		WebElement KS = driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-1']"));
		ClickAction.getAction(KS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-1']")).click();
		Thread.sleep(2000);
		
		//User profile
		WebElement userProfile = driver.findElement(By.xpath("//span[@class='xrh-verticalmenuitem--subheading']"));
		ClickAction.getAction(userProfile);
		Thread.sleep(2000);
		
		//upload image
		driver.findElement(By.xpath("//span[contains(text(),'Upload Image')]")).click();
		/*WebElement upload = driver.findElement(By.xpath("//span[contains(text(),'Upload Image')]"));
		ClickAction.clickButton(upload);
		Thread.sleep(3000);*/
		//browse
		WebElement browse = driver.findElement(By.xpath("//input[@name='file']"));
		Thread.sleep(2000);
		browse.sendKeys("/Users/sakeerthi/Documents/baby.jpeg");
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("osascript " + "/Users⁩/sakeerthi/⁨Documents/image.scpt");
		
		WebElement uploaded = driver.findElement(By.xpath("//span[@id='button-1178-btnInnerEl']"));
		ClickAction.clickButton(uploaded);
		LaunchApp.getLogger().log(LogStatus.PASS, "Image got Uploaded");
		
		LaunchApp.exitApplication();
		
	}

}
