package lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "P:\\Drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement email = d.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("rohit.choudhary@gmail.com");
		WebElement pwd = d.findElement(By.xpath("//*[@id='pass']"));
		pwd.sendKeys("HelloWorld9");
		WebElement submit = d.findElement(By.xpath("//*[@id='u_0_2']"));
		submit.click();

	}

}
