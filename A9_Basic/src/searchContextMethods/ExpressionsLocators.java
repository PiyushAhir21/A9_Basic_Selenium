package searchContextMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpressionsLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		/*
		 * xpath by attribute
		 * "//tagname[@attributeName = 'attributeValue']
		 * 
		 * xpath by text()
		 * "//tagname[text() = 'textValue']
		 * 
		 * xpath by contains
		 * "//tagname[contains(text() , 'textValue')]
		 * "//tagname[contains(@attributeName , 'attributeValue')]
		 * 
		 * xpath by multiple attribute
		 * "//tagname[@attributeName = 'attributeValue' and @attributeName = 'attributeValue']
		 * 
		 * xpath by surroundings
		 * step 1> find out the independent and dependent elements
		 * step 2> write xpath for independent element
		 * step 3> go to common parent
		 * step 4> come back to desired element
		 * 
		 * xpath by axes
		 * 
		 */
	}
}
