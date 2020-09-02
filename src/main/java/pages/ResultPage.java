package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage  extends Page implements IResultPage{

	By onViewDetails = By.cssSelector(onViewRoot+details);
	By returnViewDetails = By.cssSelector(returnViewRoot+details);
	View onView,returnView;
	public ResultPage(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void  printOnViewDetails()
	{
		 onView=new View(findElements(onViewDetails));
		onView.printView();
	}
	
	
	
	/*
	 *  .rt-tuple-container__details

 

div[data-test-attrib="return-view"] 
his.




	//button[text()='Book']/preceding-sibling::div

	 * 
	 * 
	 * 
	 * 
	 */


	

}

class View 
{
	/*********************	Time_DETAILS***************/
	
	private String timeDetails=" .rt-tuple-container__details__time";
	private String startTime=" .ms-grid-column-1.ms-grid-row-1";
	private String endTime=" .ms-grid-column-2.ms-grid-row-1";
	private String duration=" .ms-grid-column-3.ms-grid-row-1";

	private String sourceAndDestination=" .ms-grid-column-1.ms-grid-row-2";
	private String stops=" .ms-grid-column-3.ms-grid-row-2";

	private String priceDetails=" .rt-tuple-container__details__price";
	private String price=" .ms-grid-column-2.ms-grid-row-1";

			
	List<Journey> jList=new ArrayList<>();
	
	View(List<WebElement> list)
	{
		 
		
		for(WebElement e: list)
		{
			//System.out.println(e.getText());
			String start=e.findElement(By.cssSelector(timeDetails+startTime)).getText();
			String end=e.findElement(By.cssSelector(timeDetails+endTime)).getText();
			String duration=e.findElement(By.cssSelector(timeDetails+this.duration)).getText();
			String sourceAndDestination=e.findElement(By.cssSelector(timeDetails+this.sourceAndDestination)).getText();
			String stops=e.findElement(By.cssSelector(timeDetails+this.stops)).getText();
			String price =e.findElement(By.cssSelector(priceDetails+this.price)).getText();
			Journey j = new Journey(start,end,duration,sourceAndDestination,stops,price);
			System.out.println(j);
			jList.add(j);
		}
	}
	
	public void printView()
	{
		if(jList!=null)
			for(Journey j : jList)
			{
				System.out.println(j);
			}
	}
}

class Journey
{
	private String startTime,endTime,duration,sourceAndDestination,stops;
	private String price;
	
	Journey(String start,String end,String duration,String sourceAndDestination,String stops,String price)
	{
		startTime=start;
		endTime=end;
		this.duration=duration;
		this.sourceAndDestination=sourceAndDestination;
		this.stops=stops;
		this.price=price;
	}
	
	public String toString()
	{
		return startTime+"  "+endTime+" "
	+duration+" "+sourceAndDestination+"  "+stops+"  "+price;
		
	}
}
