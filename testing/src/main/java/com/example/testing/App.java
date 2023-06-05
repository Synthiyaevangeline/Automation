package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //launching the url
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        //maximize the window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Synthiya Evangeline");
        
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S");
        
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727821tuec241@skct.edu.in");
        
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("evangeline");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;	
        js.executeScript("window.scrollBy(0,3000)", "");
        js.executeScript("window.scrollBy(0,3000)", "");

//        driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/label")).click();
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        driver.quit();
    }
}
