package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		C:\Users\User\Desktop\TYPE CASTING.pdf
		driver.get("C:\\Users\\User\\git\\A9\\A9_Basic\\src\\pop_ups\\fileupload.html");
		
		Thread.sleep(2000);
		WebElement resume = driver.findElement(By.cssSelector("input[type='file']"));
		resume.sendKeys("C:\\Users\\User\\Desktop\\TYPE_CASTING.pdf");
	}
}
