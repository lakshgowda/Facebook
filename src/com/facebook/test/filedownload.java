package com.facebook.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filedownload 
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='https://bit.ly/2TlkRyu']")).click();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ACCEPT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
