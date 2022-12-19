package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		//Thread.sleep(5000);
		// pageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		WebElement CreateNA = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CreateNA.click();
		
		WebElement FName = driver.findElement(By.xpath("//*[@name='firstname']"));
		FName.sendKeys("Abhijeet");
		
		WebElement LName = driver.findElement(By.xpath("//input[@name='lastname']"));
		LName.sendKeys("Patil");
		
		WebElement MNo = driver.findElement(By.xpath("//input[@name='reg_email__' ]"));
		MNo.sendKeys("7798298652");
		
		WebElement Pass = driver.findElement(By.xpath("//input[@name='reg_passwd__' ]"));
		Pass.sendKeys("Test@123");
		
		WebElement Day = driver.findElement(By.xpath("//select[@name='birthday_day' ]"));
		
		Select dday = new Select(Day);
		dday.selectByIndex(22);             // indexing starts from 0
		
	/*	WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month' ]"));
		Select month = new Select(Month);
		month.selectByVisibleText("Jan"); 
		System.out.println("The selected month is "+ month.getFirstSelectedOption().getText());
		
		 List<WebElement> Month1 = month.getOptions();       
		 
// for each loop to iterate through the dropdown
		 
		for ( WebElement elm: Month1) {
			System.out.println(elm.getText());
			} 
			
			*/
		// to find the child of dropdowns
		
		List<WebElement> AllMonths = driver.findElements(By.xpath("//select[@name='birthday_month']"));
		
		for (WebElement Am: AllMonths) {
			System.out.println(Am.getText());
		}
	
		// to select year 
		WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year']" ));
		Select year = new Select(Year); 
		year.selectByVisibleText("1993");		
		
		
/*	String Gender = "Male";
		  WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value ='1']"));
		WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value ='2']"));
		WebElement Other = driver.findElement(By.xpath("//input[@type='radio' and @value ='-1']"));
		
		if(Gender.equals("Female")) {
		Female.click();}
		else if(Gender.equals("Male")) {
			Male.click();
		}else {
			Other.click();
			
	
	String Xpath = "//label[text()='" + Gender + "']/following-sibling::input";
	//String Xpath = "//label[text()='PlaceHolder']/following-sibling::input";
	//Xpath.replace("PlaceHolder",Gender)
		
		WebElement GenderRadioBtn = driver.findElement(By.xpath(Xpath));          // dynamic x path
		GenderRadioBtn.click();       
		
		
		String XPath = "//label[text()='PlaceHolder']/following-sibling::input";
		String newxpath = XPath.replace("PlaceHolder", Gender);
		WebElement GenderRadioBtn = driver.findElement(By.xpath(newxpath));    */    
		
		driver.findElement(By.xpath("//label[contains(text(),'Custom')]/following-sibling::input")).click();
		
		WebElement asf = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		
		Select val = new Select(asf);
		val.selectByVisibleText("They: \"Wish them a happy birthday!\"");
		driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("Hello Friends, we are done with this shit");
		


			
		}
		
		
		

	

	private static void pageLoadTimeout() {
		// TODO Auto-generated method stub
		
	}

}
