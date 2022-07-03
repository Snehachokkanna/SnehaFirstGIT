package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test62 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep (5000);
		//locate an element
		WebElement e=driver.findElement(By.name("identifier"));
		//slowly avoid getAttribute() method by using below 2 methods
		String z=e.getDomAttribute("class"); 
		//original attribute in HTML 
		System.out.println(z);
		String p=e.getDomProperty("className"); //translated property in browser DOM
		System.out.println(p);
	    //close site
		driver.close();

	}

}
