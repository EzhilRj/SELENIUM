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

public class Screenshotofsection {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demo.nopcommerce.com/ ");
		driver.manage().window().maximize();

		// Screenshot of section or portion of the page

		WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src1 = section.getScreenshotAs(OutputType.FILE);
		File targetfolder2 = new File(".\\Screenshots\\portionscreenshotexample.png");
		FileUtils.copyFile(src1, targetfolder2);

	}

}
