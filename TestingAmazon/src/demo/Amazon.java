package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		String exePath = "D:\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mi power bank");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div/a")).click();
		Thread.sleep(10000);
		String winHandleBefore = driver.getWindowHandle();

		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		driver.close();

		driver.switchTo().window(winHandleBefore);
		driver.get("https://www.amazon.in/Mi-10000mAH-Li-Polymer-Power-Black/dp/B077RV8CCY/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533532463&sr=1-1&keywords=mi+power+bank");
		
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		
		// 2 nd item
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mi earphones basic with mic");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
	}
	
	
}
