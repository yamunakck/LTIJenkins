package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Scenario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		//wait for 2 seconds for alert to appear on the screen
		WebDriverWait wait=new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.close();
		
	}

}
