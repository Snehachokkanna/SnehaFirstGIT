package crossopenbrowsers;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.image.BytePixelSetter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test74aWBlinks 
{
	public static void main(String[] args)  throws Exception
	{
		//open browser and launch site
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.in");
		Thread.sleep(5000);
		
		//Goto target page  if or target is not home page
		//collect all elements (because links developed using different tags)
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*"));
		
		//Goto each element to filter links
		
		int hyperlinkCount = 0;
		int brokenhyperlinksCount = 0;
		int workinglinkCount = 0;
		
		for (WebElement ele : allelements)
		{
			try
			{
				//1.element has "href" attribute or not
				
				if(ele.getAttribute("href")!=null)
				{
					String address = ele.getAttribute("href");	
					
				//2."href" attribute value starts with "http" or "https"
					
				if(address.startsWith("https")||address.startsWith("http"))
				{
					hyperlinkCount++;
				//connect to corresponding addressed server via API call 
					
					URL u = new URL(address);
					HttpURLConnection con = (HttpURLConnection) u.openConnection();
					con.connect();
					Thread.sleep(2000);
					
					//3."200" is status code or not
					if(con.getResponseCode()==200)
					{
						workinglinkCount++;
						//System.out.println(address+"link is working due to "+con.getResponseMessage());
					}
					else
					{
						brokenhyperlinksCount++;
						System.out.println(address+"link is broken due to "+con.getResponseMessage());
					}
					
					con.disconnect();
				}
				}
			}
			catch(Exception ex)
			{
				//relocate elements
				allelements =driver.findElements(By.xpath("//*"));
			}
		} 
		//loop closing
		
		System.out.println("All hyper links count is"+hyperlinkCount);
		System.out.println("broken hyper links count is"+brokenhyperlinksCount);
		System.out.println("working hyper links count is"+workinglinkCount);
		//close site
		driver.close();
	}
}
