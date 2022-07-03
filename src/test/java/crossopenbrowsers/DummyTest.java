package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyTest {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.name("q")); //locate once
		e.sendKeys("abdul kalam",Keys.ENTER);//operate first time &goto next page
		Thread.sleep(5000);
		driver.navigate().back();// back to previous page
		Thread.sleep(5000);
		e.sendKeys("steve jobs",Keys.ENTER); //operate 2nd time 
		//but we get "StaleElementReferenceException"due to DOM changes
		

	}

}
