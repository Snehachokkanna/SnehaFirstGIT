package crossopenbrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test75Runner {

	public static void main(String[] args) throws Exception
	{
		
		// u r checking all broken links and any individual link is broken or not of your choice
		// open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch Site
		driver.get("https://www.magnitia.com");
		Thread.sleep(5000);
		//Create object to Page class
		Test75Page pobj = new Test75Page(driver);
		//one link testing
		WebElement e = driver.findElement(By.partialLinkText("About Us"));
		System.out.println(pobj.isBrokenLink(e));
		
		//all link testing
		List <String> results = pobj.findBrokenLinks();
		System.out.println("count of broken links is "+results.size());
		for(String result : results)
		{
			System.out.println(result); // display broken link
		}
		//close site
		driver.close();
		
	}

}
