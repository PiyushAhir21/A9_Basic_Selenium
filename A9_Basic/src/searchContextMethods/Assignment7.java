package searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");

//		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("Purple");

		// React style dropdown using click + sendKeys
		driver.findElement(By.id("withOptGroup")).click();
		driver.findElement(By.xpath("//div[text()='Group 1, option 1']")).click();

	}
}
