package crossopenbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test105Runner {

	public static void main(String[] args) throws Exception
	{
		//open browser and Launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//define time limit on Javascript code execution if required
		driver.manage().timeouts().setScriptTimeout(100,TimeUnit.MILLISECONDS);
		//Automation code
		driver.get("https://www.gmail.com");
		driver.executeScript("document.body.style.zoom='200%';");
		//driver.close();

	}

}
