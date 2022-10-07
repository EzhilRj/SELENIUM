package SDET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatedPopup {

	public static void main(String[] args) {

		// Syntax
		// http://user:password@URL
		// http://admin:admin@the-internet.herokuapp.com/basic_auth

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
