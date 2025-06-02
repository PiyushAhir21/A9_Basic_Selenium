package workingWithTKS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		driver.get("https://www.facebook.com/");
		
//		Step 1 => Explicitly (downcasting) = Typecasting 
		TakesScreenshot tks = (TakesScreenshot) driver;
		
//		Step 2 => use method of TKS -> getScreenshotAs()
//					and pass parameter as OutputType.FILE
		File source = tks.getScreenshotAs(OutputType.FILE);
		
//		Step 3 => We need to copy this file as this is TEMPORARY file
		
		File destination = new File("path.png");

//		copy content from source -> destination
		FileHandler.copy(source, destination);
		System.out.println("Took ss successfullyyy !!!");
	}
}
