package Datepickers;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		driver.findElement(By.id("onward_cal")).click();
		
		String month = "Sept";
		String year = "2022";
		String Date = "23";
		
		while(true){
			
			String Mnthtitle = driver.findElement(By.className("monthTitle")).getText();
			String arr[] = Mnthtitle.split(" ");
			String mon = arr[0];
			String Yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && Yr.equals(year))
				break;
			else
					driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[3]/button")).click();
					
		}
		
		//Date Selection
		
		List<WebElement>alldates = driver.findElements(By.xpath(" (//tbody)[1]//tr/td"));
		
		for(WebElement ele: alldates) {
			
			String dt = ele.getText();
			
			if(dt.equals(Date)) {
				
				ele.click();
				break;
			}
			
			
		}
		
		
		
	}

}
