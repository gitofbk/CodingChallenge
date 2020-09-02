package module;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ResultPage;
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
	 
	 
	 
	 
  @Test
  public void test() {
	  WebDriver driver=getDriver();
	  HomePage homepage=new HomePage(driver);;
	  homepage.navigateToFlight();
	  homepage.selectRoundTrip();
	  homepage.enterFrom("Delhi");
	  homepage.selectFrom(1);
	  homepage.enterTo("Bangalore");
	  homepage.selectTo(2);
	  homepage.selectDepartureDate("03/09/2020");
	  homepage.selectReturnDate("10/09/2020");
	  homepage.search();
	  ResultPage resultpage=new ResultPage(driver);
	  resultpage.printOnViewDetails();
	  
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
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
