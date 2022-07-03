package crossopenbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Test103Runner {

	public static void main(String[] args) throws Exception
	{
		//open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		//SWD code can wait for page source from webserver by default
		//But ,SWD code cannot wait when browser is interpreting that source code into a page
		//so we need to define wait state at top of the program/test script
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//in the above statement works only for findElement() and findElements()
		//in entire program/Test-script
		//Automation code with findElement() and findElements only
		driver.findElement(By.name("identifier")).sendKeys("snehabatch@gmail.com");
		driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		driver.findElement(By.name("password")).sendKeys("sneha@1995");
		try
		{
			driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		}
		catch(StaleElementReferenceException ex)
		{

			driver.findElement(By.xpath("//span[text()='Weiter']/parent::button")).click();
		}
		driver.findElement(By.xpath("//*[@role='button'][@gh='cm']")).click();
		
		driver.findElement(By.name("to")).sendKeys("sneha.chokanna@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("alert message me");
		driver.findElement(By.xpath("//div[@g_editable='true'][@role='textbox']")).sendKeys("Hi bro\ndont sleep in CR\nbyebro");
		driver.findElement(By.name("Filedata")).sendKeys("C:\\Users\\sneha\\OneDrive\\Pictures\\DSC04841.jpg");
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		//method is not findElement(),so we need to use fixed wait or conditional wait 
		//driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account:')]/img")).click();
		Thread.sleep(5000);
		driver.close();
	
		

		
		

	}

}
