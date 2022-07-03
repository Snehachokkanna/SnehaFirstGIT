package crossopenbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test47Runner 
{

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch site
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_image_transparency");
		Thread.sleep(5000);
		//create object to Page class
		Test47Page obj = new Test47Page(driver);
		obj.moveMouse();
		Thread.sleep(5000);
		//Get details of an element after mouse move
		boolean b=obj.verifyOpacity();
		if(b)
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//close site
		driver.close();

	}

}
