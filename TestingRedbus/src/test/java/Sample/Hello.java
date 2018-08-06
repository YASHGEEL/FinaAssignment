package Sample;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.capgemini.bean.Redbus;


import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hello {
	WebDriver driver;
	Redbus registration;
	

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.redbus.in/bus-tickets/");
		driver.manage().window().maximize();
	    registration = PageFactory.initElements(driver, Redbus.class);
	    
	}
	
	
	@Given("^source is \"([^\"]*)\"$")
	public void source_is(String arg1) throws Throwable 
	{
	  registration.source.sendKeys(arg1);
	  Thread.sleep(2000);
	  registration.source.sendKeys(Keys.ENTER);
	}

	@Then("^destination is \"([^\"]*)\"$")
	public void destination_is(String arg1) throws Throwable 
	{	
		  registration.destination.sendKeys(arg1);
		  Thread.sleep(2000);
		  registration.destination.sendKeys(Keys.ENTER);
		  registration.dateClick.click();
		  Thread.sleep(2000);
		  registration.date1.click();
		  Thread.sleep(2000);
		  registration.searchButton.click();
	  
	}

	@Then("^name is \"([^\"]*)\"$")
	public void name_is(String arg1) throws Throwable 
	{
		Thread.sleep(3000);
		registration.busSelect.click();
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		Action drawAction = builder.moveToElement(registration.busSeat,60,30) //start points x axis and y axis. 
	              .click() .build();
	    drawAction.perform();
		Thread.sleep(5000);	
		registration.boardingPoint.click();
		Thread.sleep(5000);	
		registration.dropPoint.click();
		registration.proceedButton.click();
		Thread.sleep(2000);
		registration.name.sendKeys(arg1);
		
	   
	}

	@Then("^age is \"([^\"]*)\"$")
	public void age_is(String arg1) throws Throwable 
	{
		registration.gender.click();
		registration.age.sendKeys(arg1);
	}
	
	@Then("^email is \"([^\"]*)\"$")
	public void email_is(String arg1) throws Throwable 
	{
		registration.email.sendKeys(arg1);
	}
	
	@Then("^contact is \"([^\"]*)\"$")
	public void contact_is(String arg1) throws Throwable 
	{
		registration.phoneNo.sendKeys(arg1);
		registration.insurance.click();
		registration.pay.click();
	}



	
	
	
}
