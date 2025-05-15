package wd_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Options opt = driver.manage();
		Window win = opt.window();
//		win.maximize();
//		Thread.sleep(3000);
//		win.minimize();
//		Thread.sleep(3000);
//		win.fullscreen();

		Point pt = win.getPosition();
		System.out.println("Location is : " + pt);

		Thread.sleep(3000);
		driver.close(); // SocketException (Connection reset)

	}
}
