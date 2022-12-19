package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

		driver.manage().window().maximize();
		//Thread.sleep(5000);
		// pageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
        WebElement Dp = driver.findElement(By.id("dob")); 
        Dp.click();
        
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@aria-label='Select month']\"")));
        
        WebElement Month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
         Select month = new Select(Month);
         month.selectByIndex(0);
         
         WebElement Year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select year = new Select(Year);
        year.selectByVisibleText("1993"); 
        
        WebElement dte = driver.findElement(By.xpath("//a[@data-date=\"23\"]"));
        dte.click();
        
        driver.close();
        


	}

}
