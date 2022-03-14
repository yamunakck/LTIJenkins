package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class DateProviderWithInput {
	WebDriver driver;
  @Test(dataProvider = "data")
  public void LoginTest(String un, String psd) {
	  System.out.println(un+"----"+psd);
	  driver.findElement(By.name("userName")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psd);
	  driver.findElement(By.name("submit")).click();
  }
  @BeforeMethod
  public void beforeMethod(){
	//launch chrome browser
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			//open application
			driver.get("https://demo.guru99.com/test/newtours/");
  }
  @AfterMethod
  public void afterMethod(){
	  driver.close();
  }
  //store input/data here
  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "mercury", "mercury" },
      new Object[] { "mercury", "" },
      new Object[] { "m", "mercury" },
      new Object[] { "y", "m" },
    };
  }
}
