package day5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGExercise1 {
  @Test
  public void TestCase1() {
	  System.out.println("Login TC");
  }
  @Test
  public void TestCase2() {
	  System.out.println("search product TC");
  }
  /*
  @BeforeMethod //equavalent to @before in junit
  public void beforeMethod() {
	  System.out.println("chrome browser is lauching and open application");
  }

  @AfterMethod //equivalent to @after in junit
  public void afterMethod() {
	  System.out.println("closing application");
  }
  */
  
  @BeforeClass 
  public void beforeClass() {
	  System.out.println("chrome browser is lauching and open application- beforeclass");
  }
  @AfterClass 
  public void afterClass() {
	  System.out.println("closing application - after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("chrome browser is lauching and open application");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("closing application");
  }
  



}
