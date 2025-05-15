package wd_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(2000);
		
		Navigation nav = driver.navigate();
		
		nav.back();
		
		Thread.sleep(2000);
//		
//		nav.forward();
//		
//		Thread.sleep(5000);
//		
//		nav.refresh();
//		
//		Thread.sleep(3000);
//		
//		nav.to("https://www.instagram.com/");
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		driver.quit();
		
//		difference between get() and navigate()		
	}
}
