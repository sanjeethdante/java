package edu.vcentry.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookClass {

	public static void main(String[] args) {
		
      String projectroot = System.getProperty("user.dir");
      String driverpath = "\\src\\MyDrivers\\chromedriver.exe";
      
      System.out.println(projectroot);
      
      String finalpath = String.format("%s%s",projectroot, driverpath);
      
      System.out.println(finalpath);
       
      System.setProperty("webdriver.chrome.driver",finalpath);
      
      
      WebDriver drivers= new ChromeDriver();
      drivers.manage().window().maximize();
      drivers.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
      drivers.manage().timeouts().pageLoadTimeout(8000, TimeUnit.SECONDS);
      drivers.get("http://facebook.com");
      
      WebElement signIn= drivers.findElement(By.id("sign in"));
      signIn.click();
      
      drivers.close();
		
      
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
