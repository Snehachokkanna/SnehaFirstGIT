package crossopenbrowsers;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test68 
{

	public static void main(String[] args) throws Exception
	{
		//open browser 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(4000);
		//Locate all  elements (In xpath ,* indicates any type)
		List <WebElement> alleles =driver.findElements(By.xpath("//*"));
		//Segregate visible elements in all collected elements
		List <WebElement> visibleeles = new ArrayList<WebElement>();
		
		for (WebElement ele : alleles) //for each loop to take each element 
		{
			//test that element
			if(ele.isDisplayed())
			{
				visibleeles.add(ele);
			}
		}
		
		//Display few details of all visible elements by including exception handling
		for(WebElement ele : visibleeles)
		{
			try
			{
				String n = ele.getAccessibleName();
				String r = ele.getTagName();
				String bc = ele.getCssValue("background-color");
				String p = ele.getDomProperty("className");
				String a = ele.getDomAttribute("class");
				System.out.printf("%s,%s,%s,%s,%s%n", n,r,bc,p,a);
		
			}
		
		catch(Exception ex)
		{
			
			System.out.println(ex.getMessage());	
		} 
	
	   }
			//close site
	  driver.close();
			
    }

    }
