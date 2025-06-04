package workingWithJSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().fullscreen();
//		driver.manage().window().fullscreen();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		Thread.sleep(5000);
		
		WebElement fb = driver.findElement(By.linkText("Facebook"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(false)", fb);

	}
}	
