package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test39gattributegcssvalue
{

  public static void main(String[] args)  throws Exception
	{
    //open browser
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
    //Launch Site
	driver.get("https://www.gmail.com");
	Thread.sleep(5000);
	//locate an element
	WebElement e = driver.findElement(By.xpath("//button[text()='E-Mail-Adresse vergessen?']"));
	//get HTML details via getAttribute() method
	String x= e.getAttribute("type"); //type is HTML attribute
	System.out.println(x);
	//get css details via getCssValue() method
	String y = e.getCssValue("color");
	System.out.println(y);
	//close site
	driver.close();
	

	}

}
