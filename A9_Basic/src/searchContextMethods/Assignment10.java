package searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");

		// Search product
		driver.findElement(By.name("q")).sendKeys("headphones" + Keys.ENTER);

		// Apply filter using dynamic XPath
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div[text()='boAt']/preceding-sibling::div")).click();

		driver.close();
	}
}
