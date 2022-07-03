package javaStringPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class String20ex 
{
	public static void main(String[] args) throws Exception
	{
	
	WebDriverManager.chromedriver().setup(); 
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.co.in"); 
	
	WebElement e=driver.findElement(By.name ("q"));
	
	//way-1(Type casting)
	String x=(String) driver.executeScript("return (arguments[0].textContent);",e); 
	System.out.println(x);
	
	//way-2(toString() method in "Object" class)
	String y=driver.executeScript("return(arguments[0].textContent); ", e).toString();
	System.out.println(y);
	
	//way-3(using "valueOf()" method in String class) 
	Object o=driver.executeScript("return(arguments[0].textContent);", e);
	String z="";
	o=z.valueOf(o);
	
//	driver.close();
	}

}
