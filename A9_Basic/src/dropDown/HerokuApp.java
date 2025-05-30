package dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HerokuApp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

		// ----------------------- Single Select Dropdown -----------------------
		// Locate the single select dropdown using name attribute
		WebElement ssdd = driver.findElement(By.name("dropdown"));

		// Create Select object to handle dropdown operations
		Select sel = new Select(ssdd);

		// Uncomment any of the below to perform selection
		// sel.selectByIndex(1); // Selects the second option
		// sel.selectByValue("dd4"); // Selects option with value attribute "dd4"
		// sel.selectByVisibleText("VisibleText");

		// Print all dropdown options
		List<WebElement> ddOptions = sel.getOptions();
		System.out.println("Single-select dropdown options:");
		for (WebElement iterator : ddOptions) {
			System.out.println(iterator.getText());
		}

		// ----------------------- Multi-select Dropdown -----------------------
		// Locate the multi-select dropdown
		WebElement msdd = driver.findElement(By.name("multipleselect[]"));

		// Create Select object for multi-select dropdown
		Select sel2 = new Select(msdd);

		// Check and print if the dropdown allows multiple selections
		System.out.println("Is multi-select enabled? " + sel2.isMultiple());

		Thread.sleep(2000);

		// Attempting to deselect an option by index (will do nothing if not yet
		// selected)
		sel2.deselectByIndex(3);

		// Select multiple options
//		sel2.selectByIndex(0);
		sel2.selectByIndex(1);
		sel2.selectByIndex(2);
		sel2.selectByIndex(3);

		Thread.sleep(2000);

		// Deselect one option
//		sel2.deselectByIndex(0);

		// Deselect all selected options
//		sel2.deselectAll();

		// Attempt to deselect again (no exception will be thrown even if nothing is
		// selected)
//		sel2.deselectByIndex(0);
		
		
		WebElement we = sel2.getFirstSelectedOption();
		System.out.println(we.getText());
		
		List<WebElement> list = sel2.getAllSelectedOptions();
		for (WebElement i : list) {
			System.out.println(i.getText());
		}
		
		// Close the browser
		driver.close();
	}
}
