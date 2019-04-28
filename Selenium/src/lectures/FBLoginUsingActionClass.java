package lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FBLoginUsingActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "P:\\Drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		Actions act = new Actions(d);
		
		WebElement email = d.findElement(By.xpath("//*[@id='email']"));
		
		Action one= act.moveToElement(email).click().sendKeys("Rohit123@gmail.com").build();
		one.perform();
		
		WebElement pwd = d.findElement(By.xpath("//*[@id='pass']"));
		one= act.moveToElement(pwd).click().sendKeys("Rohit@123").build();
		one.perform();
		
		pwd.submit();
		
		if(d.getTitle().contains("Log in to Facebook | Facebook")){
			System.out.println("Invalid Login Credentials.");
		}
		else
		{
			System.out.println("Login successfull");
		}
		Thread.sleep(2000);
		d.close();

	}

}
