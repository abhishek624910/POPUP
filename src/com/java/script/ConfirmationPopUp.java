package com.java.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPopUp 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://javascriptkit.com/javatutors/alert2.shtml");
		
		driver.findElement(By.name("B3")).click();
		
		
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		Thread.sleep(5000);
		alt.accept();
		
	}

}
