package Log4J;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcaseswithlogs {

	public static void main(String[] args) {

		Logger logg = Logger.getLogger("Findelementlogger");
		PropertyConfigurator.configure("Log4J.properties"); // Configure with Log4j properties file

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		logg.info("Brower opened");
		driver.get("http://demo.nopcommerce.com/");
		logg.info("Browser is maximized");
		driver.manage().window().maximize();

		// findElement ( ) -- > Return the Single WebElement
		// 1
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms'] "));

		logg.info("Data is entered");
		searchbox.sendKeys("XYZ");
		// 2
		WebElement ele = driver.findElement(By.xpath(" /html/body/div[6]/div[3]/div/div/div/div/div[4]/div[1]/strong"));
		logg.info("Text is printed");
		System.out.println(ele.getText());

		logg.info("Browser is closed");
		driver.quit();

	}

}
