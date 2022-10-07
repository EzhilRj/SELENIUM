package UploadingFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSendKeys {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.monsterindia.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
//using sendKeys ()
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("D:\\SeleniumPractice\\file-sample_150kB.pdf");

    }
}
