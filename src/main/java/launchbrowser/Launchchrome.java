package launchbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Launchchrome {
	public static void main(String[] args) {

		// setting the properties
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\boske\\eclipse-workspace\\Selenium\\chase\\Driver\\chromedriver.exe");
		// to launch a browser we need an object
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	}

}
