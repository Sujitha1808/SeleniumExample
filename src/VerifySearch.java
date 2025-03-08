package com.wipro.introduction;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifySearch
{
    WebDriver driver;
	
	public void chrome()
	{
		driver = new ChromeDriver();
		System.out.println("Chrome is open now...");
	}
	public void edge()
	{
		driver = new EdgeDriver();
		System.out.println("Microsoft edge is open now...");
	}
	public void title() throws InterruptedException
	{
		driver.get("https://demo.opencart.com/");
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Your Store";
		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
		
		
		if(expectedTitle.contentEquals(actualTitle))
		{
			System.out.println("Title verification passed");
		}
		else
		{
			System.out.println("Title verification failed");
		}

		Thread.sleep(2000); 
		driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		VerifyTitleInTwoBrowser v = new VerifyTitleInTwoBrowser();
		
		v.chrome();
		v.title();
		
		v.edge();
		v.title();
			
	}
}