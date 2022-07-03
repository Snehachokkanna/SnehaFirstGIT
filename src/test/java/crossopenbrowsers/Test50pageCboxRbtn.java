package crossopenbrowsers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class Test50pageCboxRbtn 
{
	//Elements as properties
	
	private RemoteWebDriver driver;
	
	@FindBy(name = "tip1")
	private WebElement cb1;
	
	@FindBy(name="tip2")
	private WebElement cb2;
	
	@FindBy(xpath = "(//input[@type='radio' and @name='tip3'])[1]")
	private WebElement radio1;
	
	@FindBy(xpath = "(//input[@type='radio' and @name='tip3'])[2]")
    private WebElement radio2;
	
	public Test50pageCboxRbtn(RemoteWebDriver driver)
	{
		this.driver=driver;
		AjaxElementLocatorFactory afdriver = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(afdriver, this);
	}
	
	//operational methods to operate elements and observe elements
	public void selectCheckBox(int index)
	{
		
		WebElement e = null;
		
		if(index==1)
		{
			e=cb1;
		}
		else if(index==2)
		{
			e=cb2;
		}
		else
		{
			System.out.println("wrong index");
			System.exit(0);
		}
		
		//Select if it is not selected & leave it when already selected
		if(!e.isSelected())
		{
			e.click();
		}
	}
	public void deselectcheckBox(int index)
	{
		WebElement e = null;
		if(index==1)
		{
			e=cb1;
		}
		else if (index==2)
		{
			e=cb2;
		}
		else
		{
			System.out.println("wrong index");
			System.exit(0);
		}
		//de-select if it is already selected ,otherwise leave it
		if(e.isSelected())
		{
			e.click();
		}
	}
	
	public void clickRadiobutton(int index)
	{
		switch(index)
		{
			case 1:
				radio1.click();
				break;
			case 2 :
				radio2.click();
				break;
			default :
				System.out.println("wrong index");
				System.exit(0);
		}	
	}
	public boolean verifyCheckBox(int index)
	{
		WebElement e =null;
		if(index==1)
		{
			e=cb1;
		}
		else if(index == 2)
		{
			e=cb2;
		}
		else
		{
			System.out.println("wrong index");
			System.exit(0);
		
		}
		//validation
		if(e.isDisplayed())
		{
			if(e.isEnabled())
			{
				if(e.isSelected())
				{
					return(true);
				}
				else
				{
					System.out.println("Element is not selected");
					return(false);
				}
			}
				else
				{
					System.out.println("Element is not enabled");
					return(false);
				}
			}
				else
				{
					System.out.println("Element is not displayed");
					return(false);
				}
			}
	
	public boolean verifyRadioButton(int index)
	{
		WebElement e1 =null;
		WebElement e2 = null;
		switch(index)
		{
		case 1:
			e1 =radio1;
			e2 =radio2;
			break;
		case 2:
			e1=radio2;
			e2=radio1;
			break;
		default:
			System.out.println("wrong index");
			System.exit(0);
		}
		//Validation
		if(e1.isDisplayed()&&e2.isDisplayed())
		{
			if(e1.isEnabled()&&e2.isEnabled())
			{
				if(e1.isSelected()&& !e2.isSelected())
				{
					return(true);
				}
				else
				{
					System.out.println("Element is not selected");
					return(false);
				}
				}
			else
			{
				System.out.println("Element is not enabled");
				return(false);
			}
				
			}
		else
		{
			System.out.println("Element is not displayed");
			return(false);
		}
			
		}
     }

