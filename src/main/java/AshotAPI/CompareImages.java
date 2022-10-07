package AshotAPI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CompareImages {

    public static void main(String[]args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        BufferedImage expectedimage = ImageIO.read(new File("D:\\Ashot Example\\orangeHRMlogo.png"));
        WebElement logoimageelement =  driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Screenshot logoimagescreenshot = new AShot().takeScreenshot(driver,logoimageelement);
        BufferedImage actualimage = logoimagescreenshot.getImage();

        ImageDiffer imgdiff = new ImageDiffer();
        ImageDiff diff = imgdiff.makeDiff(expectedimage,actualimage);

        if(diff.hasDiff()==true) //this will compare 2 images
        {

            System.out.println("Images are Not Same");
        }
        else
        {

            System.out.println("Images are Same");
        }

        driver.quit();







    }
}
