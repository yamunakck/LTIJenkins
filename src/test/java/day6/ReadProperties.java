package day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {
	static WebDriver driver;
	static FileInputStream fis;
	static Properties prop;
	
	@BeforeClass
	public static void beforeClass() throws IOException{
		//create an object for Properties class
		fis=new FileInputStream(new File("C:\\Users\\Ramrajesh\\workspace\\LTIWebDriverTest\\config.properties"));
		prop=new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open applicdation
		driver.get(prop.getProperty("newtoursurl"));	
		
	}
	@AfterClass
	public static void afterClass(){
		driver.close();
		
	}
	@Test
	public void TC1(){
		driver.findElement(By.name("userName")).sendKeys(prop.getProperty("un"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("psd"));
		
	}
}
