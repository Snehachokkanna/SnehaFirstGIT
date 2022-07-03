package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test112DifferentBrowserTypesHTTPS {

	public static void main(String[] args) throws Exception
	{
		//open browser (opens without any history and cookies by default)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		Thread.sleep(5000);
		//Launch Site and do login
		driver1.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Do login
		driver1.findElement(By.name("identifier")).sendKeys("snehabatch@gmail.com");
		driver1.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		Thread.sleep(5000);
		driver1.findElement(By.name("password")).sendKeys("sneha@1995");
		driver1.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		Thread.sleep(5000);
		//Collect all Cookies
		Set<Cookie> s = driver1.manage().getCookies();
		ArrayList<Cookie> l =new ArrayList<Cookie>(s);
		//Take new window in other browser type (take different browser)
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		Thread.sleep(5000);
		//Launch gmail site
		driver2.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Add cookies of chrome to firefox
		for(Cookie c:l)
		{
			try
			{
				driver2.manage().addCookie(c);
						
			}
			catch(Exception ex)
			{
						
			}
		}
		driver2.navigate().refresh();
		Thread.sleep(5000);
		try
		{
			if(driver2.findElement(By.xpath("//*[text()='Compose']")).isDisplayed())
			{
				System.out.println("Gmail Session cookie working corectly");
			
			}
			
		}
		catch(Exception ex)
		{
			if(driver2.getCurrentUrl().contains("https"))
			{
				System.out.println("HTTP based sites cannot respond for shared cookies from one "
						+ "type(chrome) of browser to another type browser(firefox) due to  different encrypted algorithms");
			}
			else //http only
			{
				System.out.println("Gmail Session cookie is not working properly");
			}
		}
		
		//Close browsers
		driver1.close();
		driver2.close();

	}

}
