package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {
	
	public static void main(String[] args) {
		
		// Setting up driver path
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		
		// Calling driver object
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the page
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// 	Maximize window
		driver.manage().window().maximize();
		
		
		// Locating by id
		driver.findElement(By.id("txtUsername")).sendKeys("A42");
		
		//locating by name
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//Locating by css
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		//Am
		String AM = driver.findElement(By.id("spanMessage")).getText();
		String EM = "Invalid credentials";
		
		if(AM.equals(EM)) {
			System.out.println("Test case passed");
		}
		else
			System.out.println("Test case failed");
		
		driver.close();
	}

}
