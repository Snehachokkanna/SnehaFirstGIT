package crossopenbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test40getTextChallenge1 {

	public static void main(String[] args) throws Exception
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	    //Launch Site
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		
		//Locate child element to get that element text only
		WebElement e1=driver.findElement(By.xpath("//a[@jsname='JFyozc']"));
		String x = e1.getText();
		System.out.println(x);
		
		//Locate parent element to get that element text including descendant elements text
		WebElement e2=driver.findElement(By.xpath("//div[contains(text(),'können Sie den')]"));
		String y=e2.getText();
		System.out.println(y);
		
		//challenge -1 : To get parent element text only by excluding descendant elements text
		WebElement e3=driver.findElement(By.xpath("//div[contains(text(),'können Sie den')]"));
		//here, parent text index is 0
		String z = (String)driver.executeScript("return(arguments[0].childNodes[0].textContent);", e3);
		System.out.println(z);
		//close site
		driver.close();
		
		

	}

}
