package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTables {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();

		// How many rows in a table
		int rows = driver.findElements(By.xpath("//section[@class='innerblock']//div//table/tbody/tr")).size();
		System.out.println("No of Rows in Table" + " " + rows);

		// How many Columns in a table
		int cols = driver.findElements(By.xpath("//section[@class='innerblock']//div//table/tbody/tr/th")).size();
		System.out.println("No of columns in Table" + " " + cols);

		// Retrieve the specific row/Column data
		String retrieveddata = driver.findElement(By.xpath("//section[@class='innerblock']//div//table//tr[6]//td[1]"))
				.getText();
		System.out.println("Retrieved data is" + " " + retrieveddata);

		// Retrieve all the data from the WebTable

		for (int r = 1; r < rows; r++) {

			for (int c = 1; c < cols; c++) {

				String data = driver
						.findElement(
								By.xpath("//section[@class='innerblock']//div//table//tr[" + r + "]//td[" + c + "]"))
						.getText();
				System.out.println(data + "   ");
			}

			System.out.println();
		}

	}

}
