package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFFBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ramrajesh\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver ffdriver=new FirefoxDriver();
		
		ffdriver.quit();
	}

}
