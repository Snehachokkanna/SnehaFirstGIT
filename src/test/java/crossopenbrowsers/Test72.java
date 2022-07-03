package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test72 
{

	public static void main(String[] args)  throws Exception
	{

		//open browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(4000);
		//collect all <input> tag elements
		List <WebElement> l = driver.findElements(By.xpath("//input"));
		System.out.println("total count of input tagged elements is "+l.size());
		//seggregrate <input> tag elements in 22 types
		int rbc = 0;
		int tbc = 0;
		int bc =  0;
		int cbc = 0;
		int pbc = 0;
		int ebc = 0;
		int ubc = 0;
		int fac = 0;
		int hc = 0;
		int others =0;
		
		//for each element from 1st matched element to last method  element
		for(WebElement e :l)  
		{
			String x = e.getAttribute("type"); 
			switch(x)
			{
			case "radio" :
				rbc++;  
				 break;//terminate from current switch block (not from for each loop)
			
			case "text" :
				cbc++;
				 break;
			case "button":
				bc++;
				 break;
			case "password" :
				pbc++;
				 break;
			case "email":
				ebc++;
				 break;
			case "url" :
				ubc++;
				 break;
			case "file" :
				fac++;
				 break;
			case "hidden":
				hc++;
				 break;
			default :
				others++;
				break; //optional , because we are at end 
		}
	}
		System.out.println("count of radio buttons is "+rbc);
		System.out.println("count of check  boxes is "+cbc);
		System.out.println("count of text boxes is "+tbc);
		System.out.println("count of push buttons is "+pbc);
		System.out.println("count of url boxes is "+ubc);
		System.out.println("count of password boxes is "+rbc);
		System.out.println("count of email boxes is "+ebc);
		System.out.println("count of file attachement elements is "+fac);
		System.out.println("count of hidden elements is "+hc);
		System.out.println("count of other type elements is "+others);
		//close site
		driver.close();
	}

}
