package com.capgemini.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Redbus 
{

	@FindBy(xpath="//*[@id=\"txtSource\"]")
	public WebElement source;
	
	@FindBy(xpath="//*[@id=\"txtDestination\"]")
	public WebElement destination;
	
	@FindBy(id="txtOnwardCalendar")
	public WebElement dateClick;
	
	@FindBy(xpath="//*[@id=\"rb-calmiddle\"]/ul[2]/li[18]")
	public WebElement date1;
	
	@FindBy(xpath="/html/body/div[1]/div[4]/button")
	public WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"8194295\"]/div/div[2]/div[1]")
	public WebElement busSelect;
	
	@FindBy(xpath="//*[@id=\"rt_8194295\"]/div/div/div/div[3]/div[2]/div[2]/canvas")
	public WebElement busSeat;
	
	@FindBy(xpath="//*[@id=\"8194295\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]")
	public WebElement boardingPoint;
	
	@FindBy(xpath="//*[@id=\"8194295\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]")
	public WebElement dropPoint;
	
	@FindBy(xpath="//*[@id=\"8194295\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")
	public WebElement proceedButton;
	
	@FindBy(css="#seatno-04")
	public WebElement name;
	
	@FindBy(css="#\\32 2_0")
	public WebElement gender;
	
	@FindBy(css="#seatno-01")
	public WebElement age;
	
	@FindBy(xpath="//*[@id=\"seatno-05\"]")
	public WebElement email;
	
	@FindBy(xpath="//*[@id=\"seatno-06\"]")
	public WebElement phoneNo;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[5]/div/div[2]/div[1]/label[1]/span[2]")
	public WebElement insurance;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")
	public WebElement pay;
}
