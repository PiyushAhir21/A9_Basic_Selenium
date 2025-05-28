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

//		Single select dropdown
		WebElement ssdd = driver.findElement(By.name("dropdown"));

		Select sel = new Select(ssdd);
//		sel.selectByIndex(1);
//		sel.selectByValue("dd4");
//		sel.selectByVisibleText("khud se");

		List<WebElement> ddOptions = sel.getOptions();
		for (WebElement iterator : ddOptions) {
			System.out.println(iterator.getText());
		}

//		Multiselect dropdown
		WebElement msdd = driver.findElement(By.name("multipleselect[]"));

		Select sel2 = new Select(msdd);
		System.out.println(sel2.isMultiple());
		Thread.sleep(2000);

		sel2.deselectByIndex(3);
		Thread.sleep(1000);
		sel2.selectByIndex(0);
		sel2.selectByIndex(1);
		sel2.selectByIndex(2);
		sel2.selectByIndex(3);

		Thread.sleep(2000);

		sel2.deselectByIndex(0);

		sel2.deselectAll();

//		without selecting if deselect it wont give exception
		sel2.deselectByIndex(0);

		driver.close();
	}
}
