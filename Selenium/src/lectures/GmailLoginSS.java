package lectures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GmailLoginSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "P:\\Drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.gmail.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		Actions act = new Actions(d);
		Action one = act.sendKeys("Rohit123@gmail.com").build();
		one.perform();
		
		WebElement next = d.findElement(By.xpath("//div[@id='identifierNext']"));
		one=act.moveToElement(next).click().build();
		one.perform();
		
		one=act.sendKeys("Rohit@123").build();
		one.perform();
	}

}
