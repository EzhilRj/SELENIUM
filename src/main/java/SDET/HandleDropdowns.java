package SDET;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdowns {
	
	public static void main(String[]args) {
	WebDriverManager.chromedriver() . setup ( ) ;
	WebDriver driver = new ChromeDriver ( ) ;
	
	driver.get ( " https://www.opencart.com/index.php?route=account/register " ) ;
	
	WebElement dd = driver.findElement(By.xpath("//select[@id='input-country']"));
	Select countrydd = new Select(dd);
	//countrydd.selectByVisibleText("Cyprus");
	//countrydd.selectByValue("63");
	//countrydd.selectByIndex(10);
	
	//Select options from dropdown without sing Methods
	
	List<WebElement>alloptions = countrydd.getOptions();
	
	for(WebElement option:alloptions) {
		
		if(option.equals("Cuba"))
		{
			option.click();
			break;
		}
	}
	
	
	
	
	

}
}
