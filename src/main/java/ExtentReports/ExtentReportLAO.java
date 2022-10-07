package ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportLAO {

	WebDriver driver;
	ExtentReports extentReport;
	ExtentHtmlReporter htmlReporter;
	ExtentTest testcase;

	@BeforeSuite
	public void launchbrowser() {
		extentReport = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		extentReport.attachReporter(htmlReporter);
		driver = new ChromeDriver();

	}

	@Test
	public void opengoogle() {
		testcase = extentReport.createTest("Verify google title");
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		if (title.equals("Google")) {

			System.out.println("Test passed");
		} else {

			System.out.println("Test Failed");

		}

	}

	@Test
	public void openbing() {
		testcase = extentReport.createTest("Verify Bing title");
		driver.get("https://www.Bing.com");
		String title = driver.getTitle();
		if (title.equals("Bing")) {

			System.out.println("Test passed");
		} else {

			System.out.println("Test Failed");

		}

	}

	@Test
	public void openWikipedia() {
		testcase = extentReport.createTest("Verify Wikipedia title");
		driver.get("https://www.wikipedia.org");
		String title = driver.getTitle();
		if (title.equals("wikipedia")) {

			System.out.println("Test passed");
		} else {

			System.out.println("Test Failed");

		}

	}

	@AfterSuite
	public void closebrowser() {

		driver.quit();
		extentReport.flush();
	}

}
