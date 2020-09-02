package utility;

import org.testng.annotations.Test;

import dp.Dp;

import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class TestScript extends Dp{
	String chromeDrivePath;
	String url;
	
  @BeforeSuite
  public void beforeSuite() {
	  chromeDrivePath = "src/test/resources/drivers/chromedriver";
	  url ="https://www.cleartrip.com/";
  }

  @AfterSuite
  public void afterSuite() {
  }
  
  protected WebDriver getDriver() {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", chromeDrivePath);
		  WebDriver driver= new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  return driver;
	}

}
