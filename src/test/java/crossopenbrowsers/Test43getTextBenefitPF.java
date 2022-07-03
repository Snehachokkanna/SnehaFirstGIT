package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test43getTextBenefitPF //page class come Runner class
{
	
	
	//Dynamic elements as property
	private RemoteWebDriver driver;
	
	@FindBy(how=How.XPATH,using="(//span[@rel='current_population']/span)[8]")
	private WebElement e;
	
	//constructor method
	
	public Test43getTextBenefitPF(RemoteWebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//operational methods
	
	public String getTextofElement()
	{
		return(e.getText());
	}
	
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Create object to the page class
		Test43getTextBenefitPF obj = new Test43getTextBenefitPF(driver);
		
		//Launch Site
		driver.get("https://www.worldometers.info/world-population");
		Thread.sleep(5000);
		
		//Locate Element and get population value
		
		for (int i=1;i<=10;i++)
		{
			String p =obj.getTextofElement();
			System.out.println(p);
			Thread.sleep(1000);
		}//no staleElementreferenceException of "pageFactory" model used in locating and operating dynamic element
		
		//close site
		driver.close();	

	}

}
