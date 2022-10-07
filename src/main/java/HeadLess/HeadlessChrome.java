package HeadLess;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

    public static void main(String[]args){

        WebDriverManager.chromedriver().setup();
        ChromeOptions opt =  new ChromeOptions();
        opt.setHeadless(true);
        WebDriver driver = new ChromeDriver(opt);

        driver.get("http://demo.nopcommerce.com/");
        System.out.println("Title of the page is "+driver.getTitle());


    }
}
