package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class DynamicWebtableWithPagination {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait (Duration.ofSeconds (10));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys ("demo");
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys ("demo");
		driver.findElement(By.xpath("//button[normalize-space()= 'Login']")).click();
		
		driver.findElement(By.className("btn-close")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse-4\"]/li[1]/a")).click();
		
		//1) Find Total Number of pages in tables
		String text = driver.findElement(By.xpath("//*[@id=\"form-order\"]/div[2]/div[2]")).getText();
		System.out.println(text); //Showing 1 to 20 of 8511 (426 Pages)
		
		int totalpages = Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println("Total no of pages is "+" "+ totalpages);
		
		for(int p=1; p<totalpages;p++ ) {
			
			WebElement activepage = driver.findElement(By.xpath("(//ul[@class='pagination']//li//span)"));
			System.out.println("Active page:"+activepage.getText());
			activepage.click();
			
			int Rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("No of Rows is"+Rows);
			
			String pageno = Integer.toString(p+1);
			driver.findElement(By.xpath("(//ul[@class='pagination']//li//a[text()=' "+pageno+" ']")).click();
			
			
			
			
			
			
		}
		
		
		
		
		

	}

}
