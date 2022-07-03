package crossopenbrowsers;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test55 {

	public static void main(String[] args) throws Exception
	{
		//open browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch Site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//take screenshot of a hidden element 
		WebElement e = driver.findElement(By.name("hiddenPassword"));
		File dest = new File("target\\hiddenelementpic.png"); //  save in current project's target 
		File src =e.getScreenshotAs(OutputType.FILE);
		//generate transparent screenshot w.r.t width & height of hidden element in page source
		FileHandler.copy(src, dest);
		//close site
		driver.close();
	}

}
