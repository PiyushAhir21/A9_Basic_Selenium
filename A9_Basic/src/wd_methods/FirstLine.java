package wd_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstLine {
	public static void main(String[] args) {
//		Explaining the first line of code
		WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver = new EdgeDriver();

		/*
		 * webdriver is an interface driver is a reference variable new is a keyword
		 * which will create random memory space in heap area chromedriver() is a
		 * constructor call which will load , regirster and reinitialize the non static
		 * members
		 */

	}
}
