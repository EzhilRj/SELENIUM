package DownloadingWordFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;

public class EDGE {

    public static void main(String[]args){

        String location = System.getProperty("user.dir")+"\\Downloads\\";

        HashMap preferences  =  new HashMap();
        preferences.put("download.default_directory",location);

        EdgeOptions options = new EdgeOptions();
        options.setExperimentalOption("prefs",preferences);

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();

    }
}
