package crossopenbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test45Runner {

	public static void main(String[] args) throws Exception
	
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch site
		driver.get("https://www.gmail.com");
		Thread.sleep(6000);
		//create object to page class
		Test45Page obj = new Test45Page(driver);
		//Get details of an element
		boolean b = obj.VerifyColor("rgba(26, 115, 232, 1)");
		if(b)
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		//close site
		driver.close();
	}
}


