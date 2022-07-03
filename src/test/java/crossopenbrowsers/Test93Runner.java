package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;


public class Test93Runner 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//1
		driver.switchTo().frame(0);
		
		//2
		driver.findElement(By.tagName("input")).sendKeys("abdul kalam");
		Thread.sleep(5000);
		
		//3
		driver.switchTo().frame(0);
		
		//4
		driver.findElement(By.id("a")).click();
		Thread.sleep(5000);
		
		//5
		driver.switchTo().parentFrame();
		
		//6
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(5000);
		
		//7
		driver.switchTo().defaultContent();
		
		//8
		driver.switchTo().frame(1);
		
		//9
		WebElement e = driver.findElement(By.id("animals"));
		Select s = new Select(e);
		
		s.selectByVisibleText("Baby Cat");
		
		
		//10
		driver.switchTo().defaultContent();
		
		Thread.sleep(10000);
		
		driver.close();

	}

}
