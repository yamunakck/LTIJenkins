package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestExecution {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver();
		webDriver.get("https://www.google.com/");
		System.out.println(webDriver.getTitle());
		webDriver.close();
  }
}
