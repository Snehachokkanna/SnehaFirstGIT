package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test18NosuchElementException
{

	public static void main(String[] args) throws Exception
	{ 
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		//syntax correct but value is wrong (No element in page source
		//for given name
		driver.findElement(By.xpath("//input[@name='p']")); 

	}

}
