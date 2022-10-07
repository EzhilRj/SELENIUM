package Datepickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_Dropdowns {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();

		driver.findElement(By.id("dob")).click();

		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]")));
		month.selectByVisibleText("Sep");

		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]")));
		year.selectByVisibleText("2022");

		String Date = "23";

		List<WebElement> alldates = driver.findElements(By.xpath("(//tbody)[2]//tr"));

		for (WebElement ele : alldates) {

			String date = ele.getText();

			if (date.equals(Date)) {

				ele.click();
				break;
			}

		}
	}

}
