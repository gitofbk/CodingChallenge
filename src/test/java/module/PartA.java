package module;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.TestScript;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PartA  extends TestScript {
	 WebDriver driver;
	 HomePage homepage;
	 String url ="https://www.cleartrip.com/";
	 
	 
  @Test
  public void test() {
	  homepage.navigateToFlight();
	  homepage.selectRoundTrip();
	  homepage.enterFrom("Delhi");
	  homepage.selectFrom(1);
	  homepage.enterTo("Bangalore");
	  homepage.selectTo(2);
	  homepage.selectDepartureDate("02/09/2020");
	  homepage.selectReturnDate("10/09/2020");
	  homepage.search();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
	  driver= new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  
	  homepage=new HomePage(driver);
  }

  @AfterTest
  public void afterTest() {
  }

}
