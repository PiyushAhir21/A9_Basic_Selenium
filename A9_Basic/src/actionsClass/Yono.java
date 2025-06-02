package actionsClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yono {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("12345");

		WebElement eye = driver.findElement(By.xpath("//label[@for='password']/following-sibling::div"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(eye).build().perform();
		
		Thread.sleep(2000);
		act.release(eye).build().perform();
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
