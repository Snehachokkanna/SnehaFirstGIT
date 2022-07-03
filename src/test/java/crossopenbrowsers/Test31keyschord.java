package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test31keyschord {

	public static void main(String[] args) throws Exception
	
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.name("identifier"));
		e.sendKeys("sneha","batch");
		Thread.sleep(5000);
		e.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(4000);
		e.sendKeys(Keys.DELETE);

	}

}
