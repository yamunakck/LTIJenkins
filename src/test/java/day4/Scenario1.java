package day4;

import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\googlechrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		List<WebElement> rows=driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr"));
		
		for(int i=1;i<=rows.size();i++){		
		String flightnames=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr["+i+"]/td[1]")).getText();
		String flightprice=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr["+i+"]/td[2]/div/font")).getText();
		
		System.out.println(flightnames+"----"+flightprice);
		}
		driver.close();
	}

}
