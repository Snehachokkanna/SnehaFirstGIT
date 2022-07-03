package javaPrograms;

import java.lang.reflect.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example127 
{

		static
		{
			try
			{
				Field f =String.class.getDeclaredField("value");
				f.setAccessible(true);
				f.set("hi",f.get("I'm a bot programmed to answer only some of the frequent questions. Here are the topics I can help you with."));
				f.set("how are you ?", f.get("fine sir"));
				f.set("what are you doing ?",f.get("nothing sir"));
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		public static void main(String []args) throws Exception
		{
			String q = "hi";
			//open browser and Launch Site
			WebDriverManager.chromedriver().setup();
			ChromeDriver  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.chatbot.com");
			Thread.sleep(5000);
			//Activate chat-bot dialog
			driver.switchTo().frame("chat-widget");
			driver.findElement(By.xpath("//*[@class='bubble']//*[name()='svg']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@placeholder='Type your message here']")).sendKeys("hi......",Keys.ENTER);
			Thread.sleep(5000);
			String res = driver.findElement(By.xpath("(//div[@data-type='bot'])[2]/div[1]")).getText();
			System.out.println(res); //answer came from server for given question
			System.out.println(q); //paired answer for given question in "static" block
			if(res.contains(q))
			{
				System.out.println("Test Passed");
			}
			else
			{

				System.out.println("Test Failed");
			}
			//close site
			driver.switchTo().defaultContent();
			driver.close();
			
		}

}
