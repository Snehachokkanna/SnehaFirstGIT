package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test67 {

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
		//Segregate visible elements & hidden elements in all collected elements
		List <WebElement> v1 = new ArrayList<WebElement>();
		List <WebElement> h1 = new ArrayList<WebElement>();
		for(WebElement e:l)
		{
			//test that element
			if(e.isDisplayed())
			{
				v1.add(e);
			}
			else
			{
				h1.add(e);
			}
		}
		System.out.printf("total elements count is %d%n",l.size());
		System.out.printf("total visible elements count is %d%n",v1.size());
		System.out.printf("total hidden elements count is %d%n",h1.size());		
			//close site
		driver.close();
	}

}
