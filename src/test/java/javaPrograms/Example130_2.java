package javaPrograms;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Example130_2 {

	public static void main(String[] args)  throws Exception
	{
		// Get Expected date from keyboard
		Scanner sc = new Scanner(System.in);
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.gmail.com");
	Thread.sleep(5000);
	String x = driver.findElement(By.name("identifier")).getText();
	if(x.equals(""))
	{
		Exception e = new Exception("null value");
		throw e; //raise an exception & stops execution
	}
	else
	{
		System.out.println(x);
	}

	}

}
