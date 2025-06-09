package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		C:\Users\User\Desktop\TYPE CASTING.pdf
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		
		Thread.sleep(3000);
		WebElement resume = driver.findElement(By.id("resumeUpload"));
		resume.sendKeys("C:\\Users\\User\\Desktop\\TYPE_CASTING.pdf");
	}
}
