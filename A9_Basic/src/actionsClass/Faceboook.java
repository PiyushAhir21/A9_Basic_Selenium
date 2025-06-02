package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Faceboook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		act.sendKeys("Aarya").build().perform();
		Thread.sleep(1000);
		
		// we have to copy Username anmd paste it in password field by Ctrl + c +v
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys(args);
		
	
	}
}
