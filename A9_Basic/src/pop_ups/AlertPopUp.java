package pop_ups;

import java.awt.image.TileObserver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(2000);
		Alert ale = driver.switchTo().alert();
		ale.dismiss();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
