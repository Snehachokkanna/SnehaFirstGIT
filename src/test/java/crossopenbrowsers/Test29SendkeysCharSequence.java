package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test29SendkeysCharSequence {

	public static void main(String[] args)  throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("abdul","sneha","chokkanna","26");
		
	}

}
