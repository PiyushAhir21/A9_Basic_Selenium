package workingWithJSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		Opening the URL with the help of JSE
		jse.executeScript("window.location='https://www.zomato.com/';");

//		Getting the title with the help of JSE
		String title = jse.executeScript("return document.title;").toString();
		System.out.println(title);

		
		jse.executeScript("window.scrollBy(0,100);");
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollTo(0,500);");

		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,1000);");

		
		Thread.sleep(2000);
		driver.quit();
	}
}
