package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windontabs {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows\r\n"
				+ "\r\n"
				+ "");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		String parent = driver.getWindowHandle();
		System.out.println("before clicking the tab is "+ parent);
		
		WebElement newtab = driver.findElement(By.id("tabButton"));
		newtab.click();
		
		Set<String> alltabs = driver.getWindowHandles();
		
		for (String win: alltabs) {
			System.out.println(win);
			
			if(!win.equals(parent)) {
				driver.switchTo().window(win);
			}
		}
		
		WebElement page2 = driver.findElement(By.xpath("//body/h1"));
		System.out.println(page2.getText());
		
		
		//driver.close();
		driver.switchTo().window(parent);
		
		WebElement newwinbutt = driver.findElement(By.id("windowButton"));
		newwinbutt.click();
		
	//	driver.quit();
		
		
		
		
	}

}
