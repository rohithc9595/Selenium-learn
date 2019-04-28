package lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemouatRegAndLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","P:\\Drivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://newtours.demoaut.com");
		WebElement regClk = d.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
		regClk.click();		
		WebElement fName = d.findElement(By.xpath("//input[@name='firstName']"));
		fName.sendKeys("Rohit");
		WebElement lName=d.findElement(By.xpath("//input[@name='lastName']"));
		lName.sendKeys("Patel");
		WebElement phn=d.findElement(By.xpath("//input[contains(@name,'phone')]"));
		phn.sendKeys("5768473623");
		WebElement email=d.findElement(By.xpath("//input[@id='userName']"));
		email.sendKeys("rohit@gmail.com");
		WebElement addr1 =d.findElement(By.xpath("//input[@name='address1']"));
		addr1.sendKeys("A6 Sanman CHS");
		WebElement addr2= d.findElement(By.xpath("//input[@name='address2']"));
		addr2.sendKeys("S.S. Road");
		WebElement city=d.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Mumbai");
		WebElement state=d.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Maharashtra");
		WebElement postalCode = d.findElement(By.xpath("//input[@name='postalCode']"));
		postalCode.sendKeys("410209");
		
		WebElement country = d.findElement(By.xpath("//select[@name='country']"));
		Select s1=new Select(country);
		s1.selectByVisibleText("INDIA");
		
		WebElement usrName = d.findElement(By.xpath("//input[@name='email']"));
		usrName.sendKeys("rohichou");
		WebElement pwd= d.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("Abcd1234");
		WebElement cPwd = d.findElement(By.xpath("//input[@name='confirmPassword']"));
		cPwd.sendKeys("Abcd1234");
		WebElement submit = d.findElement(By.xpath("//input[contains(@src,'forms/submit')]"));
		submit.click();
		
		WebElement homeLink = d.findElement(By.xpath("//a[contains(text(),'Home')]"));
		homeLink.click();
		
		WebElement userName=d.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("rohichou");
		WebElement passWd = d.findElement(By.xpath("//input[@type='password']"));
		passWd.sendKeys("Abcd1234");
		WebElement login = d.findElement(By.xpath("//input[@name='login']"));
		login.click();
		
		

	}

}
