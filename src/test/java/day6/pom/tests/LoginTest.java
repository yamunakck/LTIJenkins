package day6.pom.tests;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import day6.pom.pages.HomePageClass;
import day6.pom.pages.LoginPageClass;
import day6.pom.pages.RegisterPageClass;

public class LoginTest {
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
	@Test(dataProvider="data")
	public void LoginTC(String email, String p){
		hp.click_login();
		lp.perform_login(email, p);
		if(driver.findElement(By.linkText("Log out")).isDisplayed()){
			System.out.println("Login success");
			hp.click_logout();
		}else{
			System.out.println("Login Unsuccess");
		}
	}
	
	@DataProvider
	  public Object[][] data() {
	    return new Object[][] {
	      new Object[] { "manokaleesari@gmail.com", "kalees12@" },
	      new Object[] { "manokaleesari@gmail.com", "kalees12@" },
	     
	    };
	  }
	
	

}
