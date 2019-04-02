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
		LaunchApp.extentReports("test-output/uploadimage.html","uploadimage");
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
		driver.findElement(By.xpath("//span[@class='xrh-verticalmenuitem--subheading']")).click();
		
		//upload image
		WebElement upload = driver.findElement(By.xpath("//span[contains(text(),'Upload Image')]"));
		ClickAction.clickButton(upload);
		
		//browse
		WebElement browse = driver.findElement(By.xpath("//input[@name='file']"));
		Thread.sleep(2000);
		browse.sendKeys("/Users/sakeerthi/Documents/baby.jpeg");
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("osascript " + "/Users⁩/sakeerthi/⁨Documents/image.scpt");
		
		WebElement upload1 = driver.findElement(By.xpath("//span[@id='button-1178-btnInnerEl']"));
		ClickAction.clickButton(upload1);
		LaunchApp.getLogger().log(LogStatus.PASS, "Image Uploaded");
		
		LaunchApp.exitApplication();
		
	}

}
