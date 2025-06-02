package workingWithTKS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Instagram {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		driver.get("https://www.instagram.com/");
		
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
		File src = loginBtn.getScreenshotAs(OutputType.FILE);
		File dest = new File("path.png");
		FileHandler.copy(src, dest);
		
		driver.close();
	}
}
