package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Cookie;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test111DifferentBrowserTypesHTTP {

	public static void main(String[] args) throws Exception
	{
		
		//open browser (opens without any history and cookies by default)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		Thread.sleep(5000);
		//Launch Site and do login
		driver1.get("http://expenseus.com");
		Thread.sleep(5000);
		driver1.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		driver1.findElement(By.name("user[email]")).sendKeys("magnitiait@gmail.com");
		driver1.findElement(By.name("user[password]")).sendKeys("abdulkalam");
		driver1.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(5000);
		//Collect all Cookies
		Set<Cookie> s = driver1.manage().getCookies();
		List<Cookie> l =new ArrayList<Cookie>(s);
		//Take new window in other browser type
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver2 = new FirefoxDriver();
		//Launch same site and avoid re-login via session cookie adding
		driver2.get("http://expenseus.com");
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
			if(driver2.findElement(By.linkText("Logout")).isDisplayed())
			{
				System.out.println("Session cookie test passed");
				System.out.println("HTTP based sites can respond for shared cookies from one "
						+ "type(chrome) browser to another type browser(firefox)");
			}
			
		}
		catch(NoSuchElementException ex)
		{
			if(driver2.getCurrentUrl().contains("https"))
			{
				System.out.println("HTTP based sites cannot respond for shared cookies from one "
						+ "type(chrome) browser to another type browser(firefox) due to  different encrypted algorithms");
			}
			else
			{
				System.out.println("Session cookie is failed");
			}
		}
		
		//Close browsers
		driver1.close();
		driver2.close();
		

	}

}
