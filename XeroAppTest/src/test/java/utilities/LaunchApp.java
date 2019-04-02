package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LaunchApp {

	static WebDriver driver;
	public static WebDriver getDriver() {
		return driver;
	}


	public static void setDriver(WebDriver driver) {
		LaunchApp.driver = driver;
	}


	public static ExtentReports getReport() {
		return report;
	}


	public static void setReport(ExtentReports report) {
		LaunchApp.report = report;
	}


	public static ExtentTest getLogger() {
		return logger;
	}


	public static void setLogger(ExtentTest logger) {
		LaunchApp.logger = logger;
	}

	static ExtentReports report;
	static ExtentTest logger = null;
	
	
	/*public static void extentReports(String path,String testCase) {
		
		report = new ExtentReports(path);
		//report = new ExtentReports(System.getProperty("user.dir") + "/test-output/XeroAppReport.html", false);
		logger = report.startTest(testCase);
		
	}*/
	
	public static void extentReports(String testCase ) {
		
		//report = new ExtentReports(path);
		report = new ExtentReports(System.getProperty("user.dir") + "/test-output/XeroAppReport.html", false);
		logger = report.startTest(testCase);
		
	}

	public static void startApplication() throws Exception {
		
		String browserName = "chrome";
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/sakeerthi/Documents/chromedriver");		
			driver = new ChromeDriver();
		}else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/sakeerthi/Documents/geckodriver");
			driver = new FirefoxDriver();	
		}else if(browserName.equals("Safari"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/sakeerthi/Documents/Safaridriver");
			driver = new SafariDriver();	
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		
		driver.get("https://www.xero.com/us/");
		LaunchApp.getLogger().log(LogStatus.PASS, "Application Started");
	}

	public static void waitTime(int w) throws Exception {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(w, TimeUnit.SECONDS);
		
	}

	public static void exitApplication() throws Exception {
		
		waitTime(30);
		Thread.sleep(5000);
		driver.quit();
		logger.log(LogStatus.PASS, "Exit from the Application");
		report.endTest(logger);
		report.flush();
		System.out.println("End");
		
	}

}
