package com.facebook.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Login 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.save", "application/java-archive");
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.seleniumhq.org/download/");
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='https://bit.ly/2TlkRyu']")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@title='Technical references and guides']")).click();
		System.out.println(driver.getTitle());
	}
}
