package day6.pom.tests;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import day6.pom.pages.HomePageClass;
import day6.pom.pages.LoginPageClass;
import day6.pom.pages.RegisterPageClass;

public class RegisterTest {
	WebDriver driver;
	FileInputStream fis;
	Properties prop;
	HomePageClass hp;
	RegisterPageClass rp;
	LoginPageClass lp;
	
	@BeforeClass
	public void beforeClass() throws IOException{
		//create an object for Properties class
		fis=new FileInputStream(new File("C:\\Users\\Ramrajesh\\workspace\\LTIWebDriverTest\\config.properties"));
		prop=new Properties();
		prop.load(fis);			
				
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open applicdation
		driver.get("http://demowebshop.tricentis.com/register");	
		//create an object for HomePageClass & registerpageclass
		hp=new HomePageClass(driver);
		rp=new RegisterPageClass(driver);	
		lp=PageFactory.initElements(driver, LoginPageClass.class);
		
	}
	@AfterClass
	public void afterClass(){
		driver.close();
		
	}
	@Test(enabled=false)
	public void RegisterTest(){
		hp.click_register();
		rp.perform_register_female("saranya", "Rajesh", "saran@gmail.com","password123", "password123");
		String text=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		assertTrue(text.contains("completed"));
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@Test
	public void LoginTC(){
		hp.click_login();
		lp.perform_login("saran@gmail.com", "password123");
		//assert
		
	}

}
