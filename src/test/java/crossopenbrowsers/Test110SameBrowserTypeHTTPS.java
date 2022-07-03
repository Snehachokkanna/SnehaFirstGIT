package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test110SameBrowserTypeHTTPS {

	public static void main(String[] args) throws Exception
	{

		//open browser (opens without any history and cookies by default)
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Launch Site and do login
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("identifier")).sendKeys("snehabatch@gmail.com");
		driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("sneha@1995");
		driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		Thread.sleep(5000);
		
		//take a new window/tab in chrome
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> swh = driver.getWindowHandles();
		List<String> lwh =new ArrayList<String>(swh);
		//Switch to newly created window or tab (index is 1)
		driver.switchTo().window(lwh.get(1));
		//Launch same site by skipping login due to session cookie
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		try
		{
			
			if(driver.findElement(By.xpath("//*[text()='Compose']")).isDisplayed())
			{
				System.out.print("Gmail Session cookie is working Correctly");
			}
		}
		catch(Exception ex)
		{
			System.out.print("Gmail Session cookie is not working Correctly");
			System.out.println(ex.getMessage());
		}
		//close all browser window/tabs
		driver.quit();
		
	

	}

}
