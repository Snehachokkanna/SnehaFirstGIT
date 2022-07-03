package crossopenbrowsers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Test91PageulTagCarousel 
{
	//Elements as private properties in page clas
	private RemoteWebDriver driver;
	
	//other tag carousel slider
	@FindBy(xpath="//ul[@class='carousel__list']")
	private WebElement cslider;
	
	//other tag slides under that carousel slider, which will be rotated
	@FindBys({
		@FindBy(xpath="//ul[@class='carousel__list']/li")
	})
	private List <WebElement> csliderslides;
	
	//constructor method
	public Test91PageulTagCarousel(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Operational methods
		public int getSlidesCountInCarouselSlider()
		{
			return(csliderslides.size());
		}
		
		public String getTypeofCarouselSlider()
		{
			//"transform" and "transform-style"are css properties
			String value = cslider.getCssValue("transform");
			if(value.equals("none"))
			{
				//take transform-style property value
				value=cslider.getCssValue("transform-style");
			}
			//verification
			if(value.contains("3d"))
			{
				return("3D slider");
			}
			else
			{
				return("2D slider");
			}
		}
		public boolean areSlidesMovingIncarouselSlider()
		{
			String value =cslider.getCssValue("transform");
			if(!value.equals("none"))
			{
				return(true);
			}
			else
			{
				return(false);
			}
		}
		public String getMovingDirectionOfSlidesInCarouselSlider()
		{
			String value = cslider.getCssValue("transform");
			String[] p =value.split(","); //comma (,) is seperator
			p[4] =p[4].trim(); //remove unwanted spaces
			p[5] =p[5].trim(); //remove unwanted spaces
			p[5]=p[5].replace(")",""); //remove ")" symbol
			float xoffset=Float.parseFloat(p[4]);
			float yoffset=Float.parseFloat(p[5]);
			if(xoffset <=0 && yoffset==0)
			{
				return("slides are moving from right to left");
			}
			else if(xoffset>0 && yoffset==0)
			{
				return("slides are moving from  left to right ");
			}
			else if(xoffset==0 && yoffset<=0)
			{
				return("Slides are moving from bottom to top");
			}
			else //here ,yoffset>0
			{
				return("Slides are moving from top to bottom"); //here ,yoffset>0
			}
		}
		public List<String> getMovingSlidesAdditionalDetails()
		{
			List<String> details=new ArrayList<String>();
			String value=cslider.getCssValue("transition");
			String[]p=value.split(" ");//Space as seperator
			details.add("Duration of moving each slide is " +p[1]);
			if(p[2].equals("ease-in"))
			{
				details.add("Slow start for each slide");
			}
			else if(p[2].equals("ease-out"))
			{
				details.add("Slow end for each slide");
			}
			else if(p[2].equals("linear"))
			{
				details.add("the same speed starts from start to end");
			}
			else //ease-in-out or ease 
			{
				details.add("slow start and slow end for each slide");
			}
			p[3]=p[3].replace(",",""); //remove ","
			details.add("delay in between slides is " +p[3]);
			return(details);
		}
		public boolean VerifySlidesRotationInCoursalSlider() throws Exception
		{
			driver.navigate().refresh(); //refresh page for 1st slide
			long stime = 0; //start time
			long etime =  0;// end time
			
			//wait for each slide from 1st slide to last slide 
			for(WebElement slide:csliderslides)
			{
				stime=System.currentTimeMillis();
				while(true)
				{
					//if(slide.findElement(By.xpath("child::div[1]")).isDisplayed())
						if(slide.isDisplayed())
					{
						break;
					}
						System.out.println("hi");
				}
				etime=System.currentTimeMillis();
			}
			//wait and check whether 1st slide is coming or not after last slide immediately
			Thread.sleep(etime-stime+100);
			//driver.navigate().refresh();
			if(csliderslides.get(0).isDisplayed())
			{
				return(true);
			}
			else
			{
				return(false);
			}
			
		}
			
		

}
