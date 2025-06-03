package extra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demojse {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		WebElement button = driver.findElement(By.linkText("Create new account"));
		WebElement forgottenpwd = driver.findElement(By.linkText("Forgotten password?"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println(js.executeScript("return document.title;"));
		js.executeScript("arguments[0].style.border='3px solid red';", email);
		js.executeScript("arguments[0].style.border='3px solid red';", pwd);
		js.executeScript("arguments[0].style.border='3px solid red';", login);
		js.executeScript("arguments[0].style.border='3px solid red';", button);
		js.executeScript("arguments[0].style.border='3px solid red';", forgottenpwd);
		
		js.executeScript("alert('dont do this');");
		js.executeScript("prompt('your name do this');");
	}
}
