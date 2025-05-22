package searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");

		WebElement uploadInput = driver.findElement(By.id("uploadFile"));
		uploadInput.sendKeys("C:\\Users\\User\\Desktop\\Framework.pdf");

		driver.close();
	}
}
