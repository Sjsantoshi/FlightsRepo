package Flights.Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlightsFunction {
	String baseUrl = "https://www.phptravels.net/home";
	WebDriver driver;
	
  @BeforeClass
  public  void initialize() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users/Springworks/Documents/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
	
  @Test
  public void getInfo() throws InterruptedException {
	  FlightsPageObject fpo = new FlightsPageObject(driver);
	  fpo.getFlightsTab().click();
	  fpo.getRoundTrip().click();
	  fpo.getDropdown().click();
	  fpo.getBusiness().click();
	  
	  
	  
  }
  
  @AfterClass
  public void quit()
  {
	  driver.quit();
  }
}
