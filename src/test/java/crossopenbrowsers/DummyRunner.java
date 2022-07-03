package crossopenbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyRunner {

	public static void main(String[] args) throws Exception
	
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		Dummypage pobj = new Dummypage(driver);
		pobj.fillField("abdul kalam");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		pobj.fillField("steve jobs");

	}

}
