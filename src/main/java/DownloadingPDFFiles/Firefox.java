package DownloadingPDFFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.HashMap;

public class Firefox {

    public static void main(String[]args){

        String location = System.getProperty("user.dir")+"\\Downloads\\";

        // Firefox
        FirefoxProfile profile=new FirefoxProfile();
        profile.setPreference ("browser.helperApps.neverAsk.saveToDisk","application/msword");
        profile.setPreference ("browser.download. folderList", 2); //0 - desktop 1- download 2- desiredLocation
        profile.setPreference ("browser.download.dir", location);
        FirefoxOptions options=new FirefoxOptions();
        options.setProfile (profile);


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();

    }

}
