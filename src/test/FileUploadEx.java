package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		
		WebElement Fileup = driver.findElement(By.name("uploadfile_0"));
		Fileup.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\AB.txt");
		
		WebElement Tnc = driver.findElement(By.id("terms"));
		Tnc.click();
		
		WebElement Subm = driver.findElement(By.id("submitbutton"));
		Subm.click();
		;
		
	}

}
