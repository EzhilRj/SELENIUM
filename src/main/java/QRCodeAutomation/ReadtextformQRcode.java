package QRCodeAutomation;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ReadtextformQRcode {

    public static void main(String[]args) throws IOException, NotFoundException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        String QRcodeurl = driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/img")).getAttribute("src");
        URL url = new URL(QRcodeurl);
        BufferedImage buffimage = ImageIO.read(url);
        LuminanceSource luminanceSource = new BufferedImageLuminanceSource(buffimage);
        BinaryBitmap binaryBitmap =  new BinaryBitmap(new HybridBinarizer(luminanceSource));
        Result result = new MultiFormatReader().decode(binaryBitmap);
        System.out.println(result.getText());




    }
}
