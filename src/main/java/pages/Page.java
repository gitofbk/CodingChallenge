package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page implements Ipage{

	WebDriver driver;
	
	Page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void pressEscapKey()
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	@Override
	public void click(By locator) {
		// TODO Auto-generated method stub
		WebElement e=driver.findElement(locator);
		e.click();
	}

	@Override
	public void enterText(By locator, String value) {
		// TODO Auto-generated method stub
		WebElement e=driver.findElement(locator);
		e.clear();
		e.sendKeys(value);
	}

	@Override
	public void select(By locator) {
		// TODO Auto-generated method stub
		WebElement e=driver.findElement(locator);
		if(!e.isSelected())
			e.click();
		
	}

	@Override
	public void deSelect(By locator) {
		// TODO Auto-generated method stub
		WebElement e=driver.findElement(locator);
		if(e.isSelected())
			e.click();
		
	}
	
	
	public void pickDate(By locator, String date) {
		// TODO Auto-generated method stub
		enterText(locator,date);
		pressEscapKey();
	}

	protected List<WebElement> findElements(By locator) {
		// TODO Auto-generated method stub
		return driver.findElements(locator);
	}
}
