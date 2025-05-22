package searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");

		
		Thread.sleep(3000);
		// Click edit for row containing "Cierra"
		WebElement editButton = driver.findElement(By.xpath("//div[text()='Cierra']/ancestor::div[@class='rt-tr-group']//span[@title='Edit']"));
		editButton.click();
		
		Thread.sleep(3000);
		driver.close();

	}
}
