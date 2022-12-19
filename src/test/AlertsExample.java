package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts\r\n"
				+ "\r\n"
				+ "");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		
		
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		btn1.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();   
		
		
		WebElement btn2 = driver.findElement(By.id("timerAlertButton"));
		
		btn2.click();
		Thread.sleep(5000);
		
	   alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();  		
		
			
		WebElement btn3 = driver.findElement(By.id("confirmButton"));
		
		JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].scrollIntoView();", btn3);
		btn3.click();
		
	    alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();  
		
		
		
		WebElement button5 = driver.findElement(By.id("promtButton"));
		
		
		button5.click();
		
	    alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Hello World");
		alert.accept();
		
		
		

	}

}
