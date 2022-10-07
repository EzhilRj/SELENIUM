package Waitstrategy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicityWait {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
		//Implicit wait
		driver.manage().timeouts ().implicitlyWait (Duration.ofSeconds (10));
		driver.findElement(By.name ("q")).sendKeys ("Selenium");
		driver.findElement(By.name ("q")).sendKeys (Keys. RETURN);
		driver.findElement(By.xpath("//*[text()='Selenium']")).click();

	}

}
