package Waitstrategy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericmethodforExplicitywait {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Explicit wait
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By elelocator = By.xpath("//*[text()='Selenium']");
		waitforelementpresent(driver,elelocator,10).click();
		

		
	}
	
	//Generic Method for Waiting Strategy
	public static WebElement waitforelementpresent(WebDriver driver, By locator , int timeout) {
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				
		return driver.findElement(locator);
		
		
	}

	}


