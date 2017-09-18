package com.java.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertMessagePopUp 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://irctc.co.in");
		
		WebElement logIn=driver.findElement(By.id("loginbutton"));
		logIn.click();
		
		Alert alt=driver.switchTo().alert();
		String message=alt.getText();
		System.out.println(message);
		
		alt.accept();
		
		
	}

}
