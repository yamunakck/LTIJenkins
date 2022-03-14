package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.linkText("Flights")).click();
		//wait for 20 sec to locate oneway trip on the screen
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='oneway']")));		
		//proceed furthur
		driver.close();
		
	}

}
