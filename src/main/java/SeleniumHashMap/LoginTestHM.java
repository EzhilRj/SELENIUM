package SeleniumHashMap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class LoginTestHM {

    static HashMap <String,String> logindata(){

        HashMap <String,String> hm =  new HashMap<String,String>();
        hm.put("correct value","VendoTestadmin&Vendo@2022");
        hm.put("Wrongvalue1","VendoTestadmin&Vendo@2023");
        hm.put("Wrongvalue2","VendoTestadmin&Vendo@2024");


        return hm;
    }

    public static void main(String[]args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://testvendo.ppms.co.in/#/page/signin");

        String cred = logindata().get("Wrongvalue2");
        String arr[] = cred.split("&");
        driver.findElement(By.id("input_0")).sendKeys(arr[0]);
        driver.findElement(By.id("input_1")).sendKeys(arr[1]);
        driver.findElement(By.xpath("//*[text()='Login']")).click();
    }
}
