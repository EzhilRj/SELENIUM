package SDET;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//getWindowHandle()
		String windowID=driver.getWindowHandle(); // return ID of the single browser window
		System.out.println (windowID); 
		
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/a")).click();
		

		//getWindowHandles()
		
		//FirstMethod Using Iterator
		
		Set<String> WindowIDS = driver.getWindowHandles();
		Iterator<String> it = WindowIDS.iterator();
		
		String Parentwindowid = it.next();
		String ChildwindowID = it.next();
		
		System.out.println("Parent window ID is"+" "+Parentwindowid);
		System.out.println("ChildWindow ID is"+" "+ChildwindowID);
		
		
		//Second Method - using List/ArrayList
		
		List<String> WindowIDSList=new ArrayList (WindowIDS); // converting Set -->List
		
		String parentWindowID= WindowIDSList.get(0); // Parent window id
		String childWindowID= WindowIDSList.get(1); // Child window id
		System.out.println("Parent window ID: "+parentWindowID);
		System.out.println("Child window ID: "+childWindowID);
	
		//How to use window ID's for switching
		
		driver.switchTo().window(parentWindowID); 
		System.out.println("Parent window title: "+ driver.getTitle());
		driver.switchTo().window (childWindowID);
		System.out.println("Child window title: "+ driver.getTitle());
		
		
		
	}

}
