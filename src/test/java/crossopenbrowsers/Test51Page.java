package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Test51Page 
{
	//Elements as properties
	private RemoteWebDriver driver;
	
	@FindBy(xpath="//label[text()= 'Round Trip']/preceding-sibling::input")
	private WebElement e;
	
	//Constructor method
	
	 public Test51Page(RemoteWebDriver driver) 
		{
			this.driver=driver;
			AjaxElementLocatorFactory afdriver=new AjaxElementLocatorFactory(driver,20);
			PageFactory.initElements(afdriver, this);
		}
	 //Operational methods to operate elements & Observe elements
	 public int[] getDetailsInWay1()
	 {
		 int [] x = new int[4];
		 x[0] = e.getSize().getWidth();
		 x[1] = e.getSize().getHeight(); 
		 x[2] = e.getLocation().getX();
		 x[3] = e.getLocation().getY();
		 return(x);
	 }
	 public  int [] getDetailsInWay2()
	 {
		 int [] x = new int[4];
		 x[0] = e.getRect().getWidth();
		 x[1] = e.getRect().getHeight(); 
		 x[2] = e.getRect().getX();
		 x[3] = e.getRect().getY();
		 return(x);

	 }
}
