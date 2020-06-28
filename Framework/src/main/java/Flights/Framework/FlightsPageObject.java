package Flights.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPageObject {
	
 WebDriver driver;

public FlightsPageObject(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//*[@href='#flights']")
WebElement flightsTab;

@FindBy(xpath = "//*[contains(text(), 'Round Trip')]")
WebElement roundTrip;

@FindBy(xpath = "//*[@id=\"flights\"]/div/div/form/div/div[1]/div[2]/div/div/a")
WebElement dropdown;

@FindBy(xpath = "//*[@id=\"flights\"]/div/div/form/div/div[1]/div[2]/div/div/div/ul/li[2]")
WebElement business;

@FindBy(xpath="//*[@id='FlightsDateStart']")
WebElement depart;

@FindBy(xpath="//*[@id=\"datepickers-container\"]/div[8]/nav/div[2]")
WebElement month;

@FindBy(xpath="//*[@id=\"datepickers-container\"]/div[8]/div/div[2]/div/div[7]")
WebElement selectMonth;

@FindBy(xpath="//*[@id=\"datepickers-container\"]/div[8]/div/div[1]/div[2]/div[10]")
WebElement selectDate;

@FindBy(xpath="//*[@data-date='30'][@data-month='6'][contains(text(),'30')]")
WebElement departDate;

@FindBy(xpath="//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[34]")
WebElement selectReturnDate;

@FindBy(xpath="//*[@id=\"flights\"]/div/div/form/div/div[3]/div[3]/div/div/div[2]/div/div[2]/div/span/button[1]")
WebElement adult;

@FindBy(xpath="//*[@id=\"flights\"]/div/div/form/div/div[3]/div[3]/div/div/div[3]/div/div[2]/div/span/button[1]")
WebElement infant;

@FindBy(xpath="//*[@class='btn-primary btn btn-block'][contains(text(),'Search')][1]")
WebElement search;

public WebElement getFlightsTab()
{
	return flightsTab;
}

public WebElement getRoundTrip()
{
	return roundTrip;
}


public WebElement getDropdown() {
	return dropdown;
}

public WebElement getBusiness()
{
	return business;
}

public WebElement getDepart() {
	return depart;
}


public WebElement getDepartDate() {
	return departDate;
}



public WebElement getMonth() {
	// TODO Auto-generated method stub
	return month;
}


public WebElement getSelectMonth() {
	// TODO Auto-generated method stub
	return selectMonth;
}

public WebElement getSelectDate() {
	// TODO Auto-generated method stub
	return selectDate;
}


public WebElement getReturnDate() {
	// TODO Auto-generated method stub
	return selectReturnDate;
}

public WebElement addAdult() {
	// TODO Auto-generated method stub
	return adult;
}

public WebElement addInfant() {
	// TODO Auto-generated method stub
	return infant;
}

public WebElement getSearch() {
	// TODO Auto-generated method stub
	return search;
}






}
