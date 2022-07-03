package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test19StaleElementReferenceException {

	public static void main(String[] args) throws Exception
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
	WebElement e =	driver.findElement(By.xpath("//input[@name='q']"));
	e.sendKeys("abdul kalam",Keys.ENTER); //go to results page (DOM will change)
	Thread.sleep(4000);
	driver.navigate().back(); // back to previous page
	Thread.sleep(5000);
	//relocate element to solve "StaleElementReferenceException"
	e =	driver.findElement(By.xpath("//input[@name='q']"));
	e.sendKeys(" Dr.abdul kalam",Keys.ENTER);//goto results page

	}

}
