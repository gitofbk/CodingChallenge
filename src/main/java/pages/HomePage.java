package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page{

	

	By flight=By.cssSelector(".collapseNavOnTablet ul li.flightApp ");
	By roundTrip=By.cssSelector("input#RoundTrip");
	By from=By.cssSelector("input#FromTag");
	By to=By.cssSelector("input#ToTag");
	By departDate=By.cssSelector("input#DepartDate");
	By returnDate=By.cssSelector("input#ReturnDate");
	By search = By.cssSelector("#SearchBtn");
	By selectFrom= By.cssSelector("ul.autoComplete#ui-id-1");
	By selectTo=By.cssSelector("ul.autoComplete#ui-id-2");
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void navigateToFlight()
	{
		click(flight);
	}
	
	public void selectRoundTrip()
	{
		select(roundTrip);
	}

	public void enterFrom(String place)
	{
		enterText(from,place);
	}
	
	public void enterTo(String place)
	{
		enterText(to,place);
	}
	
	public void selectDepartureDate(String date)
	{
		this.pickDate(departDate,date);
	}
	
	public void selectReturnDate(String date)
	{
		pickDate(returnDate,date);
		
	}
	
	public void search()
	{
		click(search);
	}

	public void selectFrom(int i) {
		
		// TODO Auto-generated method stub
		click(selectFrom);
	}
	
	public void selectTo(int i) {
		
		// TODO Auto-generated method stub
		click(selectTo);
	}

}
