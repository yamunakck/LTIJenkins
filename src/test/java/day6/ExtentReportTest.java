package day6;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ExtentReportTest {
	ExtentSparkReporter htmlreportloc;
	ExtentReports report;
	WebDriver driver;
	ExtentTest test;
  @Test
  public void LoginTC() {
	  test = report.createTest("Login TC");
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("submit")).click();
	  if(driver.getTitle().contains("Login")){
		  test.log(Status.PASS, "Login Success");
		  
	  }else{
		  test.log(Status.FAIL, "Login Unsucess");
	  }
  }
 @BeforeTest
  public void beforeTest() {
      //define html localtion using ExtentSparkReporter class
      htmlreportloc=new ExtentSparkReporter("E:\\data\\MyReport.html");
      //create ExtentReports class
      report=new ExtentReports();
      report.attachReporter(htmlreportloc);
      //to beautfy the report
      htmlreportloc.config().setTheme(Theme.DARK);

      //launching an appln
            System.setProperty("webdriver.chrome.driver", "C:\\\\googlechrome\\\\chromedriver_win32\\\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //open applicdation
            driver.get("https://demo.guru99.com/test/newtours/");

  }

  @AfterTest
  public void afterTest() {
	  report.flush(); //generates report
	  driver.close();
  }

}
