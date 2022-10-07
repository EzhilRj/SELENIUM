package SDET;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckboxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();

		// 1) select specific check box
		// driver.findElement(By.xpath("//input[@id='monday']")).click(); // Monday

		// 2) Select all the CheckBoxes
		List<WebElement> checkboxvalues = driver
				.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total no of Checkboxes" + "  " + checkboxvalues.size());

		for (int i = 0; i <= checkboxvalues.size(); i++) {

			checkboxvalues.get(i).click();
		}

		// 3.Select Multiple check box by choices
		// Monday & Sunday

		for (WebElement chkbx : checkboxvalues) {

			String Checkboxname = chkbx.getAttribute("id");

			if (Checkboxname.equals("Monday") || Checkboxname.equals("Sunday")) {

				chkbx.click();

			}
		}

		// 4) Select Last 2 check boxes
		// Total no of check boxes- no of check boxes want to select = starting index
		// 7-2 = 5
		int totalcheckboxes = checkboxvalues.size();

		for (int i = totalcheckboxes - 3; i < totalcheckboxes; i++) {
			
			checkboxvalues.get(i).click();
		}
		

	}

}
