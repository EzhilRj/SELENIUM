package CookiesHandling;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureCookies {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		// How To capture cookies from browser?
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of Cookies: " + cookies.size());

		// How To print cookies from browser?
		for (Cookie cookie : cookies) {

			System.out.println(cookie.getName() + " : " + cookie.getValue());

			// How To add Cookie to the browser?
			Cookie cokkieobj = new Cookie("MyCookie123", "123456");
			driver.manage().addCookie(cokkieobj);

			cookies = driver.manage().getCookies();
			System.out.println("Size of Cookies after adding :" + cookies.size()); // 6

			// How To delete specific Cookie from the browser?

			driver.manage().deleteCookie(cokkieobj);
			cookies = driver.manage().getCookies();
			System.out.println("Size of Cookies after deletion : " + cookies.size()); // 5

			// How To delete all Cookies from the browser?
			driver.manage().deleteAllCookies();
			cookies = driver.manage().getCookies();
			System.out.println("Size of Cookies after deletion :" + cookies.size()); // 0

		

		}

	}
}
