package crossopenbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test44Runner {

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		
		//create object to page class
		Test44Page obj = new Test44Page(driver);
		
		//Get details of an element
		boolean b = obj.verifyMaxLength(2048);
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
