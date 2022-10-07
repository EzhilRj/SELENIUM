package SDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVSGetattribute {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver ( ) . setup ( ) ;
		WebDriver driver = new ChromeDriver ( ) ;
		
		driver.get ( " https://admin-demo.nopcommerce.com/login" ) ;
		WebElement emailinputbox = driver.findElement ( By.xpath ( "//input[@id='Email']" ) ) ;
		emailinputbox.clear ( ) ;
		emailinputbox.sendKeys ( " adm123@gmail.com " ) ;
		// capturing text from inputbox
		System.out.println ( " Result from getAttribute ( ) method : " + emailinputbox.getAttribute ( " value " ) ) ;
		System.out.println ( " Result from getText ( ) method : " + emailinputbox.getText ( ) ) ;
		// Login button
		WebElement button = driver.findElement ( By.xpath ( "//button[normalize-space()='Log in']" ) ) ;
		System.out.println ( button.getAttribute ( " type " ) ) ;
		System.out.println ( button.getAttribute ( " class " ) ) ;
		System.out.println ( button.getText ( ));
		
	
		
		
		

	}

}
