package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_4 {
	 
	  WebDriver driver;
		@Test
	public void testcase1() throws InterruptedException 
	{
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  WebElement uname=driver.findElement(By.name("username"));
		  uname.sendKeys("Admin");
		  Thread.sleep(3000);
		  WebElement pass=driver.findElement(By.name("password"));
		  pass.sendKeys("admin123");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	    org.testng.Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	   System.out.println("Login successful"); 
	}
	@Test(dependsOnMethods="testcase1")
	public void testcase2() throws InterruptedException
	{
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		  Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  System.out.println("Logout successfull");
		  Thread.sleep(3000);
		  driver.quit();
	}
	}