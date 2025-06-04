package workingWithJSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		String gender = "Male";

		WebElement custom = driver.findElement(By.id("custom_gender"));
		custom.sendKeys(gender);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].value='Male';", custom, gender);

	}
}
