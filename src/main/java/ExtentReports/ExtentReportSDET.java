package ExtentReports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportSDET {

	WebDriver driver;
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setextent() {

		htmlreporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/test-output/SDETExtentReportSample.html");
		htmlreporter.config().setDocumentTitle("SampleAutomationReport");
		htmlreporter.config().setReportName("Functional Expert");
		htmlreporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);

		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Tester Name", "EzhilRaj");
		extent.setSystemInfo("Browser", "Chrome");

	}

	@AfterTest
	public void EndReport() {

		extent.flush();

	}

	@BeforeMethod
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.nopcommerce.com/");

	}

	@Test
	public void noCommerceTitleTest() {
		test = extent.createTest("noCommerceTitleTest");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopCommerce demo store");
	}

	@Test
	public void noCommerceLogoTest() {
		test = extent.createTest("noCommerce LogoTest");
		Boolean status = driver.findElement(By.xpath(" //img[@alt='nopCommerce dem store']")).isDisplayed();
		Assert.assertTrue(status);

	}

	@Test
	public void noCommerceLoginTest() {

		test = extent.createTest("noCommerce LogoTest");
		Assert.assertTrue(true);

	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, "TEST CASE FAILED IS" + result.getName());
			test.log(Status.FAIL, "TEST CASE FAILED IS" + result.getThrowable());
			
			ExtentReportSDET noCommerceLoginTest = null;
			String Screenshotpath =noCommerceLoginTest.getscreenshot(driver,result.getName());
			test.addScreenCaptureFromPath(Screenshotpath); // adding screen shot
		} 
		else if (result.getStatus() == ITestResult.SKIP) {
			
			test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		}
		
		else if (result.getStatus() == ITestResult.SUCCESS) {
			
		test.log(Status.PASS, "Test Case PASSED IS" + result.getName());
		}
		
		}

	

	public static String getscreenshot(WebDriver driver, String Screenshotname) throws IOException {

		String Datename = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/Screenshots/" + Screenshotname + Datename + ".png";
		File finaldestination = new File(destination);
		FileUtils.copyFile(Source, finaldestination);
		return destination;

	}

}
