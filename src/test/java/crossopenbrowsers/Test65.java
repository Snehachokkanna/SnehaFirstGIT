package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test65 {

	public static void main(String[] args) throws Exception
	{
		//open browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(4000);
		//locate an multiple elements
		List <WebElement> l =driver.findElements(By.xpath("//*[@name='magnitia']"));
		System.out.println(l.size());
		//list is empty when no element found for given locator,but no "noSuchElementException"
		//close site
		driver.close();

	}

}
