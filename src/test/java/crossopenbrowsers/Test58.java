package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test58 {

	public static void main(String[] args)  throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch Site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_submit"); 
		Thread.sleep(10000);//waiting time to load complete page 
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.name ("fname")).sendKeys("abdul"); 
		driver.findElement(By.name("lname")).sendKeys("kalam"); 
		//driver.findElement(By.xpath("//input[@value='Submit']")).click(); 
		driver.findElement(By.xpath("//input[@value='Submit']")).submit();

	}

}
