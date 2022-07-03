package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test42getTextBenefit {

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Site
		driver.get("https://www.worldometers.info/world-population");
		Thread.sleep(5000);
		
		//Locate element and get population value
		for(int i=1;i<=10;i++)
		{
			//Benefit-1: Get text of visible element including text of dynamic descendants 
			//So we avoid "StaleElementReferenceException" for those dynamic descendants
			String p=driver.findElement(By.xpath("//span[@rel='current_population']")).getText();
			System.out.println(p);
			Thread.sleep(500); //half second
		}
		//close site
		driver.close();
		

	}

}
