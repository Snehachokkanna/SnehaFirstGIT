package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.WebElement;




public class Test69 {

	public static void main(String[] args) throws Exception
	{

		//open browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(4000);
		
		//collect all tables (one tag for one type of elements)
		List <WebElement> l1 = driver.findElements(By.xpath("//table"));
		System.out.println(l1.size());
		
		//collect all textboxes (one tag for multiple types of elements)
		
		List <WebElement> l2 = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(l2.size());	
		
		//collect all links (multiple tags for one type of elements)
		List <WebElement> l3 = driver.findElements(By.xpath("(//a)|(//link)|(//href)|(//base)|(//area)"));
		System.out.println(l3.size());	 
		
		/*for(WebElement e:l3)
		{
			if(e.isDisplayed()) //only visible links
			{
				System.out.println(e.getTagName());
			}
		}
		System.out.println(l3.size());*/
		
		//close site
		driver.close();

	}

}
