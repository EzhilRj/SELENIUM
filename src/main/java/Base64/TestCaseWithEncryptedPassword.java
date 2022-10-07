package Base64;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWithEncryptedPassword {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.nopcommerce.com/login");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("pavanoltraining@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys( decodeString("dGVzdDEyMW=="));
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

    }

    static String decodeString(String password) {

        byte[] decodedString = Base64.decodeBase64(password);
        return (new String(decodedString));
    }

}
