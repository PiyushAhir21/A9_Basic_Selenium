package searchContextMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
//		<a> link text </a> => getText() => visible text(String)
		for (WebElement iterator : links) {
			String text = iterator.getText();
			System.out.println(text);
		}
		
		
//		WebElement emailField = driver.findElement(By.id("email")); //NoSuchElement
//		emailField.sendKeys("admin");
		
//		Thread.sleep(1000);
//		WebElement passField = driver.findElement(By.cssSelector("syntax"));
//		passField.sendKeys("1234567890");
		
//		driver.findElement(By.partialLinkText("F")).click();
		
//		driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2")).click(); //InvalidSelector

		Thread.sleep(5000);
		driver.close(); // SocketException
	}
}
