package SDET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleIFrames {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		//1 st frame
		//driver.switchTo().frame("packageListFrame"); // name of the frame
		//driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		
		//2nd iframe
		//driver.switchTo().frame("packageFrame");
		//driver.findElement(By.xpath("/html/body/main/ul/li[7]/a")).click();
		
		//3rd iframe
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//*[text()='Help']")).click();
	}

}
