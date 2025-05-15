package wd_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Meta Pay")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
//		driver.close(); //NoSuchSessionException(quit then close)
//		driver.close(); //NoSuchWindowException(close then close)


	}
}
