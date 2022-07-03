package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test41getTextChallenge2 
{

	public static void main(String[] args) throws Exception
	{
	//open browser
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	//Launch Site
	driver.get("https://semantic-ui.com/modules/dropdown.html");
	Thread.sleep(5000);
		
	//Challenge2: Get text of hidden element in page 
	WebElement e=driver.findElement(By.xpath("(//input[@name='gender'])[1]/following-sibling::div[2]/div[2]"));

	//way-1: using getText() 
	//String y=e.getText();
	//System.out.println(y); //blank or null because element is hidden 
	
	//way-2: using JavaScript code
	String z=(String) driver.executeScript("return (arguments[0].textContent);", e); 
	System.out.println(z); //text value will be displayed
	//close site
	driver.close();
	}

}
