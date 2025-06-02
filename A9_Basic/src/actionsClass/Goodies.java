package actionsClass;
import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Goodies {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement capital1 = driver.findElement(By.id("box1"));
		WebElement country1 = driver.findElement(By.id("box101"));
		
		WebElement capital2 = driver.findElement(By.id("box2"));
		WebElement country2 = driver.findElement(By.id("box102"));
		
		WebElement capital3 = driver.findElement(By.id("box3"));
		WebElement country3 = driver.findElement(By.id("box103"));
		
		WebElement capital4 = driver.findElement(By.id("box4"));
		WebElement country4 = driver.findElement(By.id("box104"));
		
		WebElement capital5 = driver.findElement(By.id("box5"));
		WebElement country5 = driver.findElement(By.id("box105"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(capital1, country1).build().perform();
		Thread.sleep(500);
		Thread.sleep(500);
		act.dragAndDrop(capital2, country2).build().perform();
		Thread.sleep(500);
		act.dragAndDrop(capital3, country3).build().perform();
		Thread.sleep(500);
		act.dragAndDrop(capital4, country4).build().perform();
		Thread.sleep(500);
		act.dragAndDrop(capital5, country5).build().perform();

		Thread.sleep(3000);
		driver.close();
	}
}
