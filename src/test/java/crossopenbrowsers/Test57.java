package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test57 {

	public static void main(String[] args)  throws Exception
	{
		//open browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch Site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000); // waiting time to load complete page
		//Locate visible element and get tag name
		WebElement e = driver.findElement(By.name("q"));
		//get tag name
		String x  = e.getTagName();
		System.out.println(x);
		//close site
		driver.close();

	}

}
