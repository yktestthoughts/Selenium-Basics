package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAut {

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
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//locating by name
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//Locating by css
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		//Verify result
		boolean logo = driver.findElement(By.cssSelector(
				"#branding > a:nth-child(1) > img"))
				.isDisplayed(); // true or false
		
		if(logo==true) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Failed");
		}
		
		driver.close();
		

	}

}
