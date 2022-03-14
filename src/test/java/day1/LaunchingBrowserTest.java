package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchingBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//close browser
		driver.close();

	}

}
