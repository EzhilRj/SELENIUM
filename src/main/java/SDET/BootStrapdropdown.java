package SDET;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapdropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver ( ) . setup ( ) ;
		WebDriver driver = new ChromeDriver ( ) ;
		driver.get ( " https://www.hdfcbank.com/ " ) ;
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[12]/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div/div/div[2]/div/a" ) ) . click ( ) ;
		
		List < WebElement > productTypes = driver.findElements ( By.xpath ( " // ul [ @ class = ' dropdown1 dropdown - menu ' ] / li " ) ) ;
		System.out.println ( " Number of options : " + productTypes.size ( ) ) ;
		
		for ( WebElement ptype : productTypes )
		{
		if ( ptype.getText ( ) . equals ( " Accounts " ) )
		{
		ptype.click ( ) ;
		break ;
		}
		
		
		
		

	}

	}
	
}
