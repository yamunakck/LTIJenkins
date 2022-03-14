package day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\saranya.a.shanmugam\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		//get window ID
		String oldpage=driver.getWindowHandle();
		System.out.println("currently opened page window ID is :"+oldpage);
		// click on click here link
		driver.findElement(By.linkText("Click Here")).click();
		//switch frm old window to new window
		//to get the window ID of newly opened tab, use below syntax
		Set<String> newpage=driver.getWindowHandles();
		for(String name:newpage){
			driver.switchTo().window(name);
			System.out.println("widow id of newly opened tab is :"+name);
		}
		//enter email id
		driver.findElement(By.name("emailid")).sendKeys("sara@gmail.com");
		//click on submit
		driver.findElement(By.name("btnLogin")).click();
		
		//switch from newpage to old page
		driver.switchTo().window(oldpage);
		
		//driver.close(); --> close only active tabe
		driver.quit(); //forces to close all the tabe opened in browser

	}

}
