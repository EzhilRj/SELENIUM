package DownloadingWordFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class Chrome {

	public static void main(String[] args) {

		String location = System.getProperty("user.dir")+"\\Downloads\\";
        //Chrome
		HashMap preferences  =  new HashMap();
		preferences.put("download.default_directory",location);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs",preferences);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();

	}

}