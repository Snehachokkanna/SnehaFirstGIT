package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test61 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep (5000);
		//locate an element
		WebElement e=driver.findElement(By.name("identifier"));
		String x=e.getAttribute("className"); //property in DOM object is exist
		System.out.println(x); //property value
		String y=e.getAttribute("class"); //no property, but available as attribute
		System.out.println(y); //attribute value
		String z=e.getAttribute("magnitia"); //no property and no attribute with given name
		System.out.println(z); //null
		//close site
		driver.close();

	}

}
