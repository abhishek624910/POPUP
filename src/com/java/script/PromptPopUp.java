package com.java.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptPopUp 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://javascriptkit.com/javatutors/alert2.shtml");
		
		driver.findElement(By.name("B4")).click();
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("Abhishek");
		
		Thread.sleep(2000);
		
		alt.accept();
		
		
		
	}

}
