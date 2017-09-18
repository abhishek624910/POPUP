package com.calendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarPopUp 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");
		
		//driver.findElement(By.id("BE_flight_depart_date")).click();
		
		//driver.findElement(By.id("a_2017_9_22")).click();
		String jscommand="document.getElementById('BE_flight_depart_date').value='16/12/2018'";
		JavascriptExecutor jsdriver=(JavascriptExecutor)driver;
		jsdriver.executeScript(jscommand);
		
	}

}
