package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test38Clear 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Launch site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		
		//fill
		driver.findElement(By.name("q")).sendKeys("kalam");
		Thread.sleep(5000);
		
		//clear
		WebElement e = driver.findElement(By.name("q"));
		e.clear(); 
		
		//data cleared permanently ,so no need for javascript
		System.out.println("no exception");
		Thread.sleep(5000);
		driver.close();

	}

}
