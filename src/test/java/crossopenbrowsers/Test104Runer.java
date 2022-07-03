package crossopenbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test104Runer {

	public static void main(String[] args) throws Exception
	{
		//open browser and Launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//SWD code can wait by default when page source is loading from webserver
		//but we are able to define time limit on that page loading if required
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		//Automation code
		driver.get("https://www.gmail.com");
		driver.close();
		

	}

}
