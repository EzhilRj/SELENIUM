package Log4J;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4JExample {

	public static void main(String[] args) {

		Logger log = Logger.getLogger("Loggingexample");
	    DOMConfigurator.configure("Log4J.xml");  //Configure log4j XML file
     
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		log.info("Browser is opened");
		driver.get(" https://www.bing.com/ ");
		log.info("Browser is maximized");
		driver.manage().window().maximize();

		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");

	}

}
