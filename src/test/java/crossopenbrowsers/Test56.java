package crossopenbrowsers;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test56 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		//Launch site
		driver.get("http://www.flipkart.com");
		Thread.sleep(5000);
		//take screenshot of target element
		//which is covered by other element like banner
		WebElement e =driver.findElement(By.xpath("//button[@type='submit']/parent::div"));
		File dest = new File("target\\bannerelement.png"); //save in current project folder by default 
		File src = e.getScreenshotAs(OutputType.FILE);
		//Instead of target element screenshot,
		//it captures covered banner as per that target element width and height.
		FileHandler.copy(src,dest);
		//return(dest.getAbsolutePath());
		
		//close site
		driver.close();
		
	}

}
