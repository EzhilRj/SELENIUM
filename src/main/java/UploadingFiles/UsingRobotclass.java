package UploadingFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UsingRobotclass {

    public static void main(String[] args) throws AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.monsterindia.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();

        //using Robot class methods
        WebElement button = driver.findElement(By.xpath("//input[@id='file-upload']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",button); // click action on the button

        /*
       1) Copy the path
       2) CTRL +V
       3) Enter
       */
        Robot rb=new Robot ();
        rb.delay(2000);
//put path to file in a clipboard
        StringSelection ss=new StringSelection("D:\\SeleniumPractice\\file-sample_150kB.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard ().setContents (ss, null);
//CTRL+V
        rb.keyPress (KeyEvent. VK_CONTROL); // Press on CTRL key
        rb.keyPress (KeyEvent. VK_V); // Press on CTRL key
        rb.delay(2000);
        rb.keyRelease (KeyEvent. VK_CONTROL);
        rb.keyRelease (KeyEvent. VK_V);
//ENTER
        rb.keyPress (KeyEvent. VK_ENTER);
        rb.keyRelease (KeyEvent. VK_ENTER) ;


    }
}
