package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test36Clear {

	public static void main(String[] args)  throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch site
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("kalam");
		Thread.sleep(5000);
	//Successful operation when we clear data in an element,which is covered by banner
		driver.findElement(By.name("q")).clear();
		System.out.println("no exception");
		Thread.sleep(5000);
				

	}

}
