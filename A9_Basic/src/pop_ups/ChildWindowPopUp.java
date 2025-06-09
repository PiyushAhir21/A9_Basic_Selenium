package pop_ups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.shoppersstack.com/products_page/18");
	
//		Step 1 -> get the home address
		String ParentID = driver.getWindowHandle();
		System.out.println(ParentID);
		
//		Step 2 -> perform the task which will open new child windows
		driver.findElement(By.id("compare")).click();
		
//		Step 3 -> get the address of all the windows
		Set<String> IDs = driver.getWindowHandles();
		
//		search for amazon
		for (String i : IDs) {
//			shopperstack
//			flipkart
//			ebay
//			amazon
//			driver.switchTo().window(i);
			if (driver.getCurrentUrl().contains("amazon")) {
				break;				
			}
			System.out.println(driver.getCurrentUrl());
		}

//		Step 4 -> perform the desired task on desired webpage 
		driver.findElement(By.linkText("Fresh")).click();
		
//		Step 5 -> come back to home
		driver.switchTo().window(ParentID);
		
		Thread.sleep(1000);
		driver.close();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
