package wd_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

//		Get method -> to open particular URL(FQP)
		driver.get("https://www.flipkart.com/"); // InvalidArgumentException

//		getTitle() => to get the title of the current webpage
		String title = driver.getTitle();
		String cUrl = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();

		System.out.println(title);
		System.out.println(cUrl);
		System.out.println(pageSource);

//		ctrl + / & ctrl + shift + /

		driver.findElement(By.linkText("Forgotten password?")).click();
		String title2 = driver.getTitle();
		String cUrl2 = driver.getCurrentUrl();

		System.out.println(title2);
		System.out.println(cUrl2);

	}
}
