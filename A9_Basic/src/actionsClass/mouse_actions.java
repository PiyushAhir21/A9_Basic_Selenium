package actionsClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
//		pwd.click();
		
		Actions act = new Actions(driver);
		
		
//		act.click(pwd).build().perform(); //Build method is used to build the action
											// perform method is used to perform the action
//		act.moveToElement(pwd).build().perform();
//		Thread.sleep(2000);
//		act.click().build().perform();
		
		Thread.sleep(2000);
		act.moveToElement(login).build().perform();
		
		act.contextClick(pwd).build().perform();
	}
}
