package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenaro2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
		//to maximize the browser
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//enter password
		driver.findElement(By.name("password")).sendKeys("mercury");
		//click on submit
		driver.findElement(By.name("submit")).click();
		//click on flights
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(10000);
		
		//click on oneway
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		//select passenger value from dropdown
		Select p=new Select(driver.findElement(By.name("passCount")));
		p.selectByIndex(3);
		//p.selectByValue("4");
		//p.selectByVisibleText("4");
	
		//select from
		Select d=new Select(driver.findElement(By.name("fromPort")));
		d.selectByVisibleText("London");
		
		//continue with other elements of same page
		
		Select month=new Select(driver.findElement(By.name("fromMonth")));
		month.selectByIndex(2);
		
	

	}

}
