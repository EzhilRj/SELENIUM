package TestNGAssertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestcase1 {

    @Test
    public void loginTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.get("http://testvendo.ppms.co.in/#/page/signin"); //open URL


        WebElement usernametxt = driver.findElement(By.id("input_0"));
        WebElement passwordtxt = driver.findElement(By.id("input_1"));

        //This is to check whether the textbox is displayed or not
//Test will only continue, if the below statement is true
        Assert.assertTrue(usernametxt.isDisplayed());
        usernametxt.sendKeys("VendoTestadmin");
        Assert.assertTrue(passwordtxt.isDisplayed());
        passwordtxt.sendKeys("Vendo@2022");

        driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();


    }
}