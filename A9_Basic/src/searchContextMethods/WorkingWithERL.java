package searchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WorkingWithERL {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement un = driver.findElement(RelativeLocator.with(By.tagName("input"))
												.above(By.name("pass")));
		un.sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='pass']"));
	}
}
