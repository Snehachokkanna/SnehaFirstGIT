package crossopenbrowsers;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;


public class Test106Runner {

	public static void main(String[] args) throws Exception
	{

		//open browser and Launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Collect cookies (browser opens without any cookies by default via SWD code)
		
		Set<Cookie> s = driver.manage().getCookies();
		ArrayList<Cookie> l = new ArrayList(s);	
		
		System.out.println("Count of cookies before launch a site is "+l.size()); //0
		
		//Launch Site
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		
		//Collect cookies
		s=driver.manage().getCookies();
		l=new ArrayList<Cookie>(s);
		System.out.println("Count of cookies after successful launch is" +l.size());
		
		for(Cookie c:l)
		{
			System.out.println(c.getName()+":"+c.getValue()+":"+c.getExpiry());
		}
		//Do login
		driver.findElement(By.name("identifier")).sendKeys("snehabatch@gmail.com");
		driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("sneha@1995");
		driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		Thread.sleep(5000);
		//Collect cookies
		s=driver.manage().getCookies();
		l=new ArrayList<Cookie>(s);
		System.out.println("Count of cookies after successful login is" +l.size());
		
		for(Cookie c:l)
		{
			System.out.println(c.getName()+":"+c.getValue()+":"+c.getExpiry());
		}
		//Do logout

		driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//Collect cookies
		s=driver.manage().getCookies();
		l=new ArrayList<Cookie>(s);
		System.out.println("Count of cookies after successful logout is" +l.size());
		
		for(Cookie c:l)
		{
			System.out.println(c.getName()+":"+c.getValue()+":"+c.getExpiry());
		}
		//close site
		driver.close();
		
		
	}

}
