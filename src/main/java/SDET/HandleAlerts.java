package SDET;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert window with OK button
		
		driver.findElement(By.xpath("//button[normalize-space()= 'Click for JS Alert']")).click();
		Thread.sleep (2000);
		driver.switchTo().alert().accept();
		
		//Alert window with OK & Cançel button

		driver.findElement(By.xpath("//button[normalize-space()= 'Click for JS Confirm']")).click();
		Thread.sleep (3000);
		driver.switchTo().alert().accept(); // Close alert by using OK button
		//driver.switchTo().alert().dismiss(); //close alert by using cancel button
		
		//Alert window with input box, capture text from alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep (3000);
		Alert alertwindow=driver.switchTo().alert();
		System.out.println("The message displayed on alert: "+alertwindow.getText());
		alertwindow.sendKeys ("Welcome");
		alertwindow.accept();
	}

}
