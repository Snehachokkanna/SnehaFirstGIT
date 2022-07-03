package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test63 {

	public static void main(String[] args)  throws Exception
	{
		//open browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(4000);
		//locate an element 
		WebElement e = driver.findElement(By.name("identifier"));
		//Get details
		String x  = e.getAccessibleName();
		System.out.println(x);
		//close site
		driver.close();
		
	}

}
