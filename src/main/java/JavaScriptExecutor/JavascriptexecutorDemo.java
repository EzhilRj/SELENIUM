package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptexecutorDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");

		// Syntax
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript(Script, args);

		// flash
		WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		JavascriptUtil.flash(logo, driver);

		// Drawing border & take screenshot
		/*
		 * WebElement logo =
		 * driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		 * JavascriptUtil.drawborder(logo, driver);
		 * 
		 * TakesScreenshot ts = (TakesScreenshot)driver; File src=
		 * ts.getScreenshotAs(OutputType.FILE); File trg = new File(".\\Logo.png");
		 * FileUtils.copyFile(src, trg);
		 */

		// Getting title of the page
		// String title = JavascriptUtil.getTitleByJS(driver);
		// System.out.println(title);

		// click action
		// WebElement reg = driver.findElement(By.className("ico-register"));
		// JavascriptUtil.clickElementByJS(reg, driver);

		// Generate alert
		// JavascriptUtil.generateAlert(driver, "This is My Selenium Alert.....");

		// Refreshing the page
		//JavascriptUtil.refreshBrowserByJS(driver);
		
		// Scrolling down page
		//JavascriptUtil.scrollPageDown(driver);
		
		//Thread.sleep(2000);
		
		// Scroll up page
		//JavascriptUtil.scrollPageUp(driver);
		
		
		// Zoom page
		//JavascriptUtil.zoomPageByJS(driver);
		
		

	}

}
