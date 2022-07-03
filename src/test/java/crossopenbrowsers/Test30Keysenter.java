package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test30Keysenter {

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("sneha","batch",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("sneha@1995",Keys.ENTER);
		Thread.sleep(4000);

	}

}
