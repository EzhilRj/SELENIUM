package HeadLess;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

    public static void main(String[]args){

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions opt =  new FirefoxOptions();
        opt.setHeadless(true);
        WebDriver driver = new FirefoxDriver(opt);

        driver.get("http://demo.nopcommerce.com/");
        System.out.println("Title of the page is "+driver.getTitle());


    }
}
