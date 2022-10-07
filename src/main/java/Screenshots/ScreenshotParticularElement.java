package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotParticularElement {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demo.nopcommerce.com/ ");
		driver.manage().window().maximize();

		// Screenshot of particular element of the page

		WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		File src2 = logo.getScreenshotAs(OutputType.FILE);
		File targetfolder3 = new File(".\\Screenshots\\Elementscreenshotexample.png");
		FileUtils.copyFile(src2, targetfolder3);

	}

}
