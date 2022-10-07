package AshotAPI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CaptureLogo {

    public static void main(String[]args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        WebElement logoelement =  driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Screenshot Logoimagescreenshot =  new AShot().takeScreenshot(driver,logoelement);
        ImageIO.write(Logoimagescreenshot.getImage(),"png",new File("D:\\Ashot Example\\orangeHRMlogo.png"));
        File f =  new File("D:\\Ashot Example\\orangeHRMlogo.png");

        if(f.exists()){

            System.out.println("Image File is Captured");
        }else {

            System.out.println("Image File doesn't Exist");
        }




    }
}
