package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
				
		// enter username
		// WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));   // x path
		
		WebElement UserNameCSS = driver.findElement(By.cssSelector("input#email"));     // CSS selector
		
		
		
	 // enter password
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		
		
		UserNameCSS.sendKeys("abc@xyz.com");
		Password.sendKeys("Test@1223");
		LoginButton.click();
		
		
		
	}

}
