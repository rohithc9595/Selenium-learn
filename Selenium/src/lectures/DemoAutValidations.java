package lectures;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAutValidations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Checking some validation functions of selenium
		
		System.setProperty("webdriver.chrome.driver","P:\\Drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.newtours.demoaut.com/");
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		// Wait till username is visible on screen
		// Explicit Wait
		
		WebDriverWait w = new WebDriverWait(d,30);
		
		try{
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='userName']")));
		}
		catch(Exception e){
			System.out.println("Element not visible");
		}
		
		WebElement register = d.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
		register.click();
		
		if(d.getPageSource().contains("©"));
		{
			WebElement home = d.findElement(By.xpath("//a[contains(text(),'Home')]"));
			home.click();
			String title = d.getTitle();
			System.out.println(title);
			
			if(title.contains("Mercury"))
			{
				System.out.println("Homepage is displayed correctly.");
			}
			
		}		
		
	}

}
