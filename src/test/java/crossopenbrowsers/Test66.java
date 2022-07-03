package crossopenbrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test66 {

	public static void main(String[] args)  throws Exception
	{
		//open browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(4000);
		//Locate all  elements (In xpath ,* indicates any type)
		List <WebElement> l =driver.findElements(By.xpath("//*"));
		System.out.println(l.size());
		driver.close();


	}

}
