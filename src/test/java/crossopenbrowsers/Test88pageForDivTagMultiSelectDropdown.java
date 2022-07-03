package crossopenbrowsers;

import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domstorage.model.Item;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.sun.javafx.image.BytePixelSetter;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Test88pageForDivTagMultiSelectDropdown 
{
	//Elements as private properties
	private RemoteWebDriver driver;
	
	//<div> tag drop down element
	@FindBy(xpath="//a[@id='multiple-selection']/following-sibling::div")
	private WebElement skillsdropdown;
	
	
	//<div> tag drop down element's item
	@FindBys({
		@FindBy(xpath="//a[@id='multiple-selection']/following-sibling::div/div[2]/div")	
	})
	private List <WebElement> dropdownitems;
	
	//constructor method
	public Test88pageForDivTagMultiSelectDropdown(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//operational methods
	public int getDropdownItemsCount()
	{
		return(dropdownitems.size());
	}
	
	public void openDropdown() throws Exception
	{
		skillsdropdown.click();
		Thread.sleep(2000);
	}
	
	public void closeDropdown() throws Exception
	{
		skillsdropdown.sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
	}
	
	public List<String> getDropdownItemsList() throws Exception
	{
		//Get all items list
		List<String> l = new ArrayList<String>();
		for(WebElement item : dropdownitems)
		{
			l.add((String)driver.executeScript("return(arguments[0].textContent);",item));
		}
		return(l);
	}
	
	public void selectItemByIndex(int index) throws Exception
	{
		if(index>=dropdownitems.size()||index<0) //out of bound index of negative index
		{
			System.out.println("wrong index,so 1st item came as default");
			dropdownitems.get(0).click(); //1st item
		}
		else
		{
			dropdownitems.get(index).click(); //desired item
		}
	}
	
	public void selectItemByName(String name) throws Exception
	{
		//Find item , which matched with given name
		int flag =0;
		for(WebElement item: dropdownitems)
		{
			if(item.getText().equalsIgnoreCase(name))
			{
				item.click();
				Thread.sleep(2000);
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("wrong item name,so 1st item name came as default");
			dropdownitems.get(0).click(); //1st item
		}
	}
	
	public void selectAll() throws Exception
	{
		//select all items one by one
		for(WebElement item:dropdownitems)
		{
			item.click();
			Thread.sleep(2000);
		}
	}
	
	public void selectItemsInRange(int ll,int ul)throws Exception
	{
		if(ll>=0 &&ul<dropdownitems.size()&&ll<=ul)
		{
			//select each item in given range
			for(int i=ll;i<ul;i++)
			{
				dropdownitems.get(i).click();
				Thread.sleep(2000);
			}
		}
	
	else
	{
		System.out.println("Given Range is wrong please check again");
		System.exit(0); //0 means forcibly stop execution
	}
	}
	
	public String getFirstSelectedItem()
	{
		List<WebElement> sitems=skillsdropdown.findElements(By.xpath("child::a"));
		return(sitems.get(0).getText());
	}
	
	public String getLastSelectedItem()
	{
		List<WebElement> sitems=skillsdropdown.findElements(By.xpath("child::a"));
		return(sitems.get(sitems.size()-1).getText());
	}
	
	public List<String> getAllSelectedItems()
	{
		List<String> l = new ArrayList<String>(); //empty list
		List<WebElement> sitems=skillsdropdown.findElements(By.xpath("child::a"));
		for(WebElement sitem : sitems)
		{
			l.add(sitem.getText());
		}
		return(l);
	}
	
	public void deselectItemByIndex(int index) throws Exception
	{
		//Get all selected items
		
		List<WebElement> sitems=skillsdropdown.findElements(By.xpath("child::a"));
		
		//Delete required item using index
		
		if(index >= sitems.size()||index<0) //out of bound index or negative index
		{
			System.out.println("wrong index,no item deselected");
		}
		else {
			sitems.get(index).findElement(By.xpath("child::i")).click();
		Thread.sleep(2000);
	}
}

	public void deselectItemByName(String name)throws Exception
	{
		//Get all selected items
		List<WebElement> sitems=skillsdropdown.findElements(By.xpath("child::a"));
		//Delete required item using given name
		int flag=0;
		for(WebElement sitem : sitems)
		{
			if(sitem.getText().equalsIgnoreCase(name))
			{
			sitem.findElement(By.xpath("child::i")).click();
			Thread.sleep(2000);
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("wrong item name,so no item deselected ");
	}
	}
	public void deselectAll() throws Exception
	{
		//Get all selected items
		List<WebElement> sitems=skillsdropdown.findElements(By.xpath("child::a"));
		//delete all
		for(WebElement sitem:sitems)
		{
			sitem.findElement(By.xpath("child::i")).click();
			Thread.sleep(2000);
		}
	}
	
}
