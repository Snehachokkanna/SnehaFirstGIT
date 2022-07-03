package javaPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class work1 extends Thread
{
	public void run()
	{
	System.out.println("Thread1 is running");
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.gmail.com");
	}
}
