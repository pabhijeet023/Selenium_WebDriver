package test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total no of rows are "+ rows.size());
		
		List<WebElement> Col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println("The number of columns are "+ Col.size());
		
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]"));
	
		System.out.println("The required data is "+ data.getText());
		
/*		for( WebElement Row: rows) {                // foreach loop
			
			List<WebElement> Allcell = Row.findElements(By.tagName("td"));    // By.xpath("//th or //td")
			
			for( WebElement cells: Allcell) {
				System.out.print(cells.getText());
			}
			System.out.println();
		
		} */
		
		for( int row=1; row<=rows.size(); row++) {
			
			for( int colm=1; colm<=Col.size(); colm++) {
				
				WebElement cell = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + row + "]/*[" + colm + "]"));
				System.out.print(cell.getText() + "\t");
			}
			System.out.println();
		}
		
		// from company name select the country
		
		String company = "Magazzini Alimentari Riuniti";
		String Xpath = "//td[text() ='" + company + "']/following-sibling::td[2]";
				
			WebElement country = driver.findElement(By.xpath(Xpath));          // dynamic x path
			System.out.println("The country name is "+ country.getText());
		
	}

}
