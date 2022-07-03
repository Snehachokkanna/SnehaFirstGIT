package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test37Clear {

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch site
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		//close banner 
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(5000);
		//fill
		driver.findElement(By.name("q")).sendKeys("kalam");
		Thread.sleep(5000);
		//clear
		WebElement e = driver.findElement(By.name("q"));
		//e.clear(); //not clearing data permanently
		driver.executeScript("arguments[0].value='';",e); //clear permanently via Javascript
		System.out.println("no exception");
		Thread.sleep(5000);
		driver.close();
	}

}
