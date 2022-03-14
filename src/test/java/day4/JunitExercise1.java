package day4;

import java.io.InterruptedIOException;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExercise1 {
	WebDriver driver;
	
	@Test
	public void Testcase1(){
		System.out.println("Test Case 1");
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//enter password
		driver.findElement(By.name("password")).sendKeys("mercury");
		//click on submit
		driver.findElement(By.name("submit")).click();
		//check whether login is success
		String actualresult = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
		Assert.assertEquals("Login Successfully", actualresult);
		
	}
	
	@Test
	public void Testcase2() throws InterruptedException{
		System.out.println("flights search");
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(5000);
		//check whether title of webpage is Find a Flight: Mercury Tours: 
		String title=driver.getTitle();
		Assert.assertEquals("Find a Flight: Mercury Tours: ", title);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		//select passenger , from, to
	}
	
	@Before
	public void before(){
		System.out.println("Pre-requisite ");
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
		
	}
	
	@After
	public void after(){
		System.out.println("Postcondition");
		driver.close();
		
	}

}
