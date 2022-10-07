package Waitstrategy;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
import com.google.common.base.Functions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Declaration of fluent wait
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout (Duration.ofSeconds (30))
				.pollingEvery (Duration.ofSeconds (5))
				.ignoring(NoSuchElementException.class);
		

		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		//Usage of Fluent Wait
		WebElement element = mywait.until(new Function<WebDriver, WebElement>() {
			  public WebElement apply(WebDriver driver) {
			    return driver.findElement(By.xpath("//*[text()='Selenium']"));
	 }
		});
		element.click();
				
	}
		
		
		
		
}