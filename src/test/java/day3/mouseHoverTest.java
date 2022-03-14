package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\saranya.a.shanmugam\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//WebElement computers=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
		WebElement computers=driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a"));
		WebElement accessories=driver.findElement(By.xpath("//a[contains(text(),'Accessories')]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(computers).moveToElement(accessories).click().build().perform();
		driver.close();
		

	}

}
