package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class Test87PageForDivTagSingleSelectDropdown 
{

	//Elements as private properties
	private RemoteWebDriver driver;
	
	//<div> tag dropdown element
	@FindBy(xpath="//a[@id='selection']/following-sibling::div[2]")
	private WebElement genderdropdown;
	
	//<div> tag dropdown elements items
	@FindBys({
		@FindBy(xpath="//a[@id='selection']/following-sibling::div[2]/div[2]/div")
	})
	private List<WebElement> dropdownitems;
	
	//constructor method
	public Test87PageForDivTagSingleSelectDropdown(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Operational methods
	public int getDropdownItemsCount()
	{
		return(dropdownitems.size());
	}
	
	public List<String> getDropdownItemList() throws Exception
	{
		//open dropdown
		genderdropdown.click();
		Thread.sleep(5000);
		//get all items list
		List<String>l = new ArrayList<String>();
				for(WebElement item:dropdownitems)
				{
					l.add(item.getText());
				}
		//close drop down
		genderdropdown.sendKeys(Keys.ESCAPE);
		return(l);
	}
	
	public void SelectItemByIndex(int index) throws Exception
	{
		genderdropdown.click();
		Thread.sleep(5000);
		if(index>=dropdownitems.size()||index<0) //out of bound index on  negative index
		{
			System.out.println("wrong index,so 1st item come as default");
			dropdownitems.get(0).click(); //1st item
			
		}
		else
		{
			dropdownitems.get(index).click(); //1st item index is 0 in collections
		}
	}
	
	public void SelectItemByName(String Name)throws Exception
	{
		genderdropdown.click();
		Thread.sleep(5000);
		int flag=0;
		for(WebElement item : dropdownitems)
		{
			if(item.getText().equalsIgnoreCase(Name))
			{
				item.click();
				Thread.sleep(5000);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("wrong index,so 1st item come as default");
			dropdownitems.get(0).click(); //1st item
		}
	}
	public String getSelectedItem()
	{
		return(genderdropdown.findElement(By.xpath("child::div[1]"))).getText();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	


