package SDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Statusofwebelement {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get ( " https://demo.nopcommerce.com/register " ) ;
		Thread.sleep(2000);
		// isDisplayed ( ) isEnabled ( )
		WebElement searchStore = driver.findElement ( By.id ( "small-searchterms" ) ) ;
		System.out.println ( " Display status : " + searchStore.isDisplayed ( ) ) ; // true
		System.out.println ( " Enabled status : " + searchStore.isEnabled ( ) ) ;
		
		// isSelected ( )
		WebElement male = driver.findElement ( By.id ( "gender-male" ) ) ;	
		WebElement female = driver.findElement ( By.id ( "gender-female" ) ) ;
		System.out.println ( male.isSelected ( ) ) ; // False
		System.out.println ( female.isSelected ( ) ) ; // False
		male.click( ) ; // selects male radio button
		
		System.out.println ( male.isSelected ( ) ) ; // True
		System.out.println ( female.isSelected ( ) ) ; // False
		
		female.click ( ) ; // selects female radio button
		System.out.println ( male.isSelected ( ) ) ; // True
		System.out.println ( female.isSelected ( ) ) ; // False
		
		
		
		
	}
	
	

}
