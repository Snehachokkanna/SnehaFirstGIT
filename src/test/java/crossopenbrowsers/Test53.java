package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test53 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		//Launch Site
		driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		Thread.sleep(5000);
		//Element is covered by other element like banner
		WebElement e = driver.findElement(By.linkText("1"));
		//get size info
		int w=e.getSize().getWidth();
		int h=e.getSize().getHeight();
		System.out.println(w+" "+h);
		//get location info
		int x= e.getLocation().getX();
		int y = e.getLocation().getY();
		System.out.println(x+" "+y);
		//get rect info
		int w1  =e.getRect().getWidth();
		int h1  = e.getRect().getHeight();
		int x1 = e.getRect().getX();
		int y1 =e.getRect().getY();
		System.out.println(w1+" "+h1+" "+x1+" "+y1);
		//close site
		driver.close();	
		
	}

}
