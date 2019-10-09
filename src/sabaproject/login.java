package sabaproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		String baseUrl = "http://dts-automation.fraudlens.com/";
		driver.get(baseUrl);
		
		//driver.findElements(By.id("email")).sendkeys("admin@fraudlens.com")
		WebElement email = driver.findElement(By.id("email"));	
	email.sendKeys("admin@fraudlens.com");
	WebElement paswd = driver.findElement(By.id("pwd"));	
	//email.sendKeys("admin@fraudlens.com");
	paswd.sendKeys("admin@110");
	driver.findElement(By.name("btnsubmit")).click();
	}

}
