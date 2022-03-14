package day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Ramrajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicitwait statement
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//open appln
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php#");
		//fetch no of columns
		//*[@id="leftcontainer"]/table/thead/tr/th[1]
		List<WebElement> col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("column size is :"+col.size());
		
		//fetch no of rows
		//*[@id="leftcontainer"]/table/tbody/tr[1]
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("no of rows is :"+rows.size());
		
		//fetch specifc data from the cell
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[2]
		
		String cell = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]")).getText();
		if(cell.equals("A")){
			System.out.println("data validation is success");
		}else{
			System.out.println("data is incorrect");
		}
		//check which company is on TOP
		
		String toplist=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("top company name is :"+toplist);
		
		//fetch top 5 company list
		for(int i=1;i<=5;i++){
			String list=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+"i"+"]/td[1]")).getText();
			System.out.println(list);
		}
		
		driver.close();
	
	}

}
