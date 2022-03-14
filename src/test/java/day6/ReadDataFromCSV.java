package day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadDataFromCSV {
	static WebDriver driver;
	
	@Test
	public void LoginTC() throws IOException, CsvException{
		
		//locate my csv file
		CSVReader csvReader=new CSVReader(new FileReader("C:\\SeleniumDrivers\\data\\LoginTestData.csv"));
		
		String[] csvCell;
		//read all cell data from csv file
		while((csvCell=csvReader.readNext())!=null){
			String un=csvCell[0];
			String psd=csvCell[1];
			System.out.println(un+"----"+psd);
			driver.findElement(By.name("userName")).sendKeys(un);
			driver.findElement(By.name("password")).sendKeys(psd);
			driver.findElement(By.name("submit")).click();
			if(driver.getTitle().contains("Login")){
				System.out.println("valid credentials");
				driver.findElement(By.linkText("SIGN-OFF")).click();
			}else{
				System.out.println("Invalid credentials");
			}
		}
			
	}
		
	
	@BeforeClass
	public static void beforeClass(){
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");	
		
	}

	@AfterClass
	public static void afterClass(){
		driver.close();
		
	}
}
