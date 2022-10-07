package SDET;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElemntVSFindElemnts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		// findElement ( ) -- > Return the Single WebElement
		 // 1
		WebElement searchbox = driver.findElement ( By.xpath( "//input[@id='small-searchterms'] " ) ) ;
		searchbox.sendKeys ( "XYZ" ) ;
		// 2
		WebElement ele  = driver.findElement ( By.xpath ( " /html/body/div[6]/div[3]/div/div/div/div/div[4]/div[1]/strong" ) ) ;
		System.out.println ( ele.getText ( ) ) ;
		
		//Findelements ()----->	Return Multiple WebElements
		
		List<WebElement>links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of elements captured:"+links.size());
		
		for(WebElement elem: links) {
			
			System.out.println(elem.getText());
		}
		
	

	}

}
