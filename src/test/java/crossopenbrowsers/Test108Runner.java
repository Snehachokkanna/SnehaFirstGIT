package crossopenbrowsers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test108Runner {

	public static void main(String[] args) throws Exception
	{
		//open browser (opens without any history and cookies by default)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site "gmail.com" and it has super domain like "google.com"
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("identifier")).sendKeys("snehabatch@gmail.com");
		driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("sneha@1995");
		driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		Thread.sleep(5000);
		//Common Code
		//Collect all loaded cookies
		Set<Cookie> s = driver.manage().getCookies();
		System.out.println("Count of cookies is "+s.size()); //0
		for(Cookie c :s)
		{
			
			if(c.isHttpOnly())
			{
				//when protocol is HTTP
				if(c.getName().equalsIgnoreCase("session-id")||c.getName().contains("SID"))
				{
					System.out.println(c.getName()+"is session cookie without secure");
				}
				else if(c.getName().equalsIgnoreCase("session-id-time"))
				{
					System.out.println(c.getName()+"is persistent cookie without secure");
					System.out.println("It can expire on "+c.getExpiry());
				}
				else
				{
					System.out.println(c.getName()+"is pure Http-only cookie");
				}
			}
			else if(c.isSecure())
			{
				//when protocol is HTTPS
				if(c.getName().equalsIgnoreCase("session-id")||c.getName().contains("SID"))
				{
					System.out.println(c.getName()+"is session cookie without secure");
				}
				else if(c.getName().equalsIgnoreCase("session-id-time"))
				{
					System.out.println(c.getName()+"is persistent cookie without secure");
					System.out.println("It can expire on "+c.getExpiry());
				}
				else
				{
					System.out.println(c.getName()+"is pure secure cookie");
				}
				
			}
			else if(c.getDomain().contains("amazon.com"))
			{
				System.out.println(c.getName()+"is Super cookie");
			}
			else if (c.getDomain().contains("amazon.in"))
			{
				System.out.println(c.getName()+"is Same-Site cookie");
			}
			else
			{
				System.out.println(c.getName()+"is third -party cookie");
			}
		}
	
		//close site
		driver.close();
	


	}

}
