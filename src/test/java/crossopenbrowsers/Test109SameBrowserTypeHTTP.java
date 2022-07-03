package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test109SameBrowserTypeHTTP {

	public static void main(String[] args) throws Exception
	{
		//open browser (opens without any history and cookies by default)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch Site and do login
		driver.get("http://expenseus.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("user[email]")).sendKeys("magnitiait@gmail.com");
		driver.findElement(By.name("user[password]")).sendKeys("abdulkalam");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(5000);
		//take a new window/tab in chrome
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> swh = driver.getWindowHandles();
		List<String> lwh =new ArrayList<String>(swh);
		//Switch to newly created window or tab (index is 1)
		driver.switchTo().window(lwh.get(1));
		//Launch same site by skipping login due to session cookie
		driver.get("http://expenseus.com");
		Thread.sleep(5000);
		try
		{
			
			if(driver.findElement(By.xpath("//*[text()='Logout']")).isDisplayed())
			{
				System.out.print("Session cookie is working Correctly");
			}
		}
		catch(Exception ex)
		{
			System.out.print("Session cookie is not working Correctly");
			System.out.println(ex.getMessage());
		}
		//close all browser window/tabs
		driver.quit();
		
	}

}
