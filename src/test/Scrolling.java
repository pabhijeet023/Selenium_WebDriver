package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		
		WebElement target = driver.findElement(By.xpath("//h2[text()='HTML Table Tags']"));
		
		JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].scrollIntoView();", target);    // to get the target locator
		
		 A.executeScript("window.scrollTo(0,document.body.scrollHeight);"); //  scroll down
		
	   A.executeScript("window.scrollTo(0, -document.body.scrollHeight);"); //  scroll up

	   
	  
	// =======================================================================
		
	   Actions act = new Actions(driver);
	   act.sendKeys(Keys.PAGE_DOWN).build().perform();
	   // Scroll to bottom
	   act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
	}

	
}
