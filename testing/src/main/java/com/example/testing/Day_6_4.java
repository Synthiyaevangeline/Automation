package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_6_4 {
	public static  void main(String[] args)
	{
	WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
     
	driver.navigate().to(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	String Url  = driver.getCurrentUrl();
	if(Url.equals(Url))
		System.out.println("Login Successful");
	else
		System.out.println("Login failed");
	
	
}

}