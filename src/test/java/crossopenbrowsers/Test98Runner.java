package crossopenbrowsers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test98Runner {

	public static void main(String[] args) throws Exception
	{
		//open initial browser window and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		//Fill active element
		driver.switchTo().activeElement().sendKeys("abdulkalam",Keys.TAB);
		Thread.sleep(5000);
		//Fill active element
		driver.switchTo().activeElement().sendKeys("batch255",Keys.TAB, Keys.TAB);
		Thread.sleep(5000);
		//Click on active element
		driver.switchTo().activeElement().click();

	}

}
