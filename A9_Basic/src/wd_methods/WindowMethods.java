package wd_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMethods {
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

//		size related methods
		Dimension dim = win.getSize();
		System.out.println(dim);

		Dimension dim2 = new Dimension(1382 / 2, 736 / 2);

		win.setSize(dim2);
		System.out.println(win.getSize());

//		Point pt = win.getPosition();
//		System.out.println("Location is : " + pt);
//
//		Point pt2 = new Point(100, 100);
//		
//		win.setPosition(pt2); // We need to pass object only

		Thread.sleep(3000);
		driver.close(); // SocketException (Connection reset)

	}
}
