package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		// step1 to click on Login button.
		
		WebElement Loginlink= driver.findElement(By.linkText("Log in"));
		Loginlink.click();
		
		// enter username
		WebElement Username = driver.findElement(By.name("user_login"));
		Username.sendKeys("abc@xyz.com");
		
	 // enter password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@1223");
		
		// remember me
		
		WebElement Checkbox = driver.findElement(By.className("rememberMe"));
		Checkbox.click();
		//enter Login
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
		
		// capture the error
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ExpError = Error.getText();
		String ActError = "The email or password you have entered is invalid.";
		if ( ActError==ExpError) {
			System.out.println("Tc Passed");
		}else {
			System.out.println("Tc failed");
		}
		// to findHyperlinks present on web page
		List<WebElement>  Links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are "+Links.size());
		
		for ( int index=0; index<Links.size(); index++) {
			 System.out.println(Links.get(index).getAttribute("href"));
		}
		
		// close the browser
		driver.close();  
	}

}
