package edu.vcentry.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBookClass {

	public static void main(String[] args) {
		String projectRoot = System.getProperty("user.dir");
		String driverPath = "\\src\\mydrivers\\chromedriver.exe";

		System.out.printf("Project root - %s\n", projectRoot);
		String finalPath = String.format("%s%s", projectRoot, driverPath);
		System.out.printf("final path - %s\n", finalPath);
		// ChromeDriver path =>
		
		System.setProperty("webdriver.chrome.driver", finalPath);
	

		// Initializing the driver
		WebDriver Mydrivers = new ChromeDriver();
		Mydrivers.manage().window().maximize();
		Mydrivers.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Mydrivers.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Mydrivers.get("http://facebook.com");

		WebElement signIn = Mydrivers.findElement(By.id("sign-in"));
		signIn.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Mydrivers.close();
		Mydrivers.quit();

	


	}

}
