package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIEBrowser {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\Ramrajesh\\Downloads\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		WebDriver obj=new InternetExplorerDriver();
		obj.get("https://www.google.com");
		
		//obj.quit();
	}

}
