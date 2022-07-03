package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Test85page
{

	//elements as private properties
	private RemoteWebDriver driver;
	
	@FindBy(name="q")
	private WebElement searchbox;
	
	@FindBys({
		
		@FindBy(xpath = "(//ul[@role='listbox'])[1]/li")
	})
	private List <WebElement> suggestions;
	
	//Constructor method
	public Test85page(RemoteWebDriver driver)
	{
			this.driver = driver;
			PageFactory.initElements(driver,this);
	}
	//Operational methods
	public int getCountofSuggestions()
	{
		return(suggestions.size());
	}
	
	public void fillSearchbox(String word)
	{
		searchbox.clear();
		searchbox.sendKeys(word);
	}
	
	public String getTextofSuggestion(int index)
	{
		WebElement e =suggestions.get(index).findElement(By.xpath("descendant::span[1]"));
		return(e.getText());
	}
	
	public List<String> getTextofAllSuggestions()
	{
		List <String> values = new ArrayList<>();
		for(WebElement suggestion : suggestions)
		{
			WebElement e =suggestion.findElement(By.xpath("descendant::span[1]"));
			values.add(e.getText());
		}
		return(values);
	}
	
	public boolean VerifyAllSuggestionns(String word)
	{
		int flag =0;
		for(WebElement suggestion : suggestions)
		{
			WebElement e =suggestion.findElement(By.xpath("descendant::span[1]"));
			if(!e.getText().toLowerCase().contains(word.toLowerCase()))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	
	}
		
	public	List<String> getMismatchedSuggestions(String word)
	{
		List <String> values = new ArrayList<>();
		for(WebElement suggestion : suggestions)
		{
			WebElement e =suggestion.findElement(By.xpath("descendant::span[1]"));
			if(!e.getText().toLowerCase().contains(word.toLowerCase()))
			{
				values.add(e.getText());
			}
		
	}
		return(values);
		
	}	
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



