package methods_of_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		

		driver.get("https://www.facebook.com/");

		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("admin");
//		Thread.sleep(1000);
//		un.clear();
//
//		Thread.sleep(500);
//		un.sendKeys("admin");

		WebElement loginBtn = driver.findElement(By.name("login"));
//		loginBtn.click();
//		loginBtn.submit(); // type='submit' and child of form tag

		String text = loginBtn.getText();
		String tag = un.getTagName();
		String attrValue = loginBtn.getAttribute("data-testid");
		String cssValue = loginBtn.getCssValue("text-align");

		System.out.println(text);
		System.out.println(tag);
		System.out.println(attrValue);
		System.out.println(cssValue);

		Dimension dim = loginBtn.getSize();
		System.out.println(dim);
		System.out.println(dim.getWidth());
		System.out.println(dim.getHeight());

		Point pt = loginBtn.getLocation();
		System.out.println(pt);
		System.out.println(pt.getX());
		System.out.println(pt.getY());

		Rectangle rect = loginBtn.getRect();
		System.out.println(rect.getDimension());
		System.out.println(rect.getPoint());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());

//		Verification
//		isDisplayed(), isEnabled(), isSelected()
		if (loginBtn.isDisplayed()) {
			if (loginBtn.isEnabled()) {
//				loginBtn.submit();
			}
		}

		driver.findElement(By.linkText("Create new account")).click();

		Thread.sleep(2000);
		WebElement male = driver.findElement(By.xpath("//label[text()='Male']/input"));
		if (male.isDisplayed()) {
			if (male.isEnabled()) {
				System.out.println(male.isSelected());
				male.click();
				Thread.sleep(1000);
				System.out.println(male.isSelected());
			}
		}

		Thread.sleep(3000);
		driver.close();
	}
}
