package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCHbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
		//click on Register link
		driver.findElement(By.linkText("REGISTER")).click();
		//enter username as saranya
		driver.findElement(By.name("email")).sendKeys("saranya");
		//enter password as password123
		driver.findElement(By.name("password")).sendKeys("password123");
		//enter confirmpassword
		driver.findElement(By.name("confirmPassword")).sendKeys("password123");
		//click on submit
		driver.findElement(By.name("submit")).click();
		//close the browser
		driver.close();
		
		

	}

}
