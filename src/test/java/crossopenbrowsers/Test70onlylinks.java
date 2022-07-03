package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Test70onlylinks {

	public static void main(String[] args) throws Exception
	{
		//open browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch Site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//locate all links
		List<WebElement> l =driver.findElements(By.xpath("//a"));
		//Segregate visible elements for all links		
		List<WebElement> v1 = new ArrayList<WebElement>(); //for visible element list
		for(WebElement e : l) //for each loop to take each element 
		{
			//test that element 
			if(e.isDisplayed())
			{
				v1.add(e);
			}
		}
		//Display details of all visible elements
		for(WebElement e: v1)
		{
			String n = e.getText();
			System.out.printf("%s%n",n);
			
		}
		//close site
		driver.close();
		
	}
		
		
	}