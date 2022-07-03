package javaPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class work3 extends Thread
{

	public void run()
	{
	System.out.println("Thread3 is running");
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	}

}
