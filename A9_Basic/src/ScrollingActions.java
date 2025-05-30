import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.swiggy.com/");
		
		WebElement tandc = driver.findElement(By.linkText("Terms & Conditions"));
		
		Actions act = new Actions(driver);
//		act.scrollToElement(tandc).build().perform();
		

		for (int i = 0; i < 10; i++) {
			act.scrollByAmount(0, 50).build().perform();
			Thread.sleep(100);
		}
		
		for (int i = 0; i < 10; i++) {
			act.scrollByAmount(0, -50).build().perform();
			Thread.sleep(100);
		}
		
		Thread.sleep(3000);
		driver.close();
	}
}	
