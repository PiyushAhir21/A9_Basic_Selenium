import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://facebook.com/");
		
		WebElement pwd = driver.findElement(By.id("pass"));
//		un.sendKeys("admin");
		
		Actions act = new Actions(driver);
		act.sendKeys("admin").build().perform();
		act.sendKeys(pwd,"admin" + Keys.ENTER).build().perform();
		
		
//		act.keyDown(Keys.ENTER).perform();
//		act.keyUp(Keys.ENTER).perform();
		
	}
}
