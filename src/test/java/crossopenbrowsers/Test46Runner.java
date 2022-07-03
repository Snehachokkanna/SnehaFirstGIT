package crossopenbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test46Runner {

	public static void main(String[] args)  throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Site
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		
		//create object to page class
		Test46Page obj = new Test46Page(driver);
		
		//move mouse to element
		obj.moveMouse();
		Thread.sleep(5000);
		//Get details of an element after mouse move
		boolean b = obj.verifyUnderlined();
				if(b)
				{
					System.out.println("Test passed");
				}
				else
				{
					System.out.println("test failed");
				}
			//close site
		driver.close();
	}

}
