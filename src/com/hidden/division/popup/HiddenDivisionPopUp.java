package com.hidden.division.popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivisionPopUp 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://uplc/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		
		driver.findElement(By.name("task[0].name")).sendKeys("ABC");
		
		driver.findElement(By.linkText("Archives")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("DiscardChangesButton")).click();
		
		
		
		
		
	}

}
