package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		//perform scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		//take a screenshot
		TakesScreenshot s=(TakesScreenshot)driver;
		File src = s.getScreenshotAs(OutputType.FILE); //taking screenshot is happening
		//copy src to place it in local system
		File dest=new File("C:\\L&TI\\reports\\Screenshot1.png");
		FileUtils.copyFile(src,dest);
		Thread.sleep(2000);
		driver.close();
		
	}

}
