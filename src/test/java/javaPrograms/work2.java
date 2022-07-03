package javaPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class work2  extends Thread
{
	public void run()
	{
	System.out.println("Thread2 is running");
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	}

	
	


}
