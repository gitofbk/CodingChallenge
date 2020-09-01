package pages;

import org.openqa.selenium.By;

public interface Ipage {

	 void click(By locator);
	 void enterText(By locator,String value);
	 void select(By locator);
	 void deSelect(By locator);
	 void pickDate(By locator, String date);
}
