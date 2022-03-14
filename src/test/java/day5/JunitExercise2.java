package day5;
import static org.junit.Assert.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExercise2 {
	WebDriver driver;
	
	@Test
	public void TestCase1(){
		//verify whether Register and link is availble on Home page
		WebElement registerlink=driver.findElement(By.linkText("Register"));
		WebElement loginlink=driver.findElement(By.linkText("Log in"));
		assertTrue(registerlink.isDisplayed());
		assertTrue(loginlink.isDisplayed());
		
	}
	@Test
	public void TestCase2()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("manoharange@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Manoharan");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//verify login success
		String emailtext=driver.findElement(By.linkText("manoharange@gmail.com")).getText();
		assertTrue(emailtext.contains("manoharange"));
		assertEquals("manoharange@gmail.com",emailtext);
		assertTrue(driver.findElement(By.linkText("manoharange@gmail.com")).isEnabled());
				
	}
	@Before
	public void before(){
		System.out.println("Pre-requisite ");
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
	}
	@After
	public void after(){
		driver.close();
		
	}

}
