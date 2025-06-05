import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.dream11.com/");

		int index = 0;
		String id = "send-sms-iframe";
		WebElement we = driver.findElement(By.cssSelector("iframe[title='Iframe Example']"));

		driver.switchTo().frame(we);

		driver.findElement(By.id("regEmail")).sendKeys("9596972122");

		driver.switchTo().parentFrame();
		
		driver.findElement(By.linkText("About Us")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
}
