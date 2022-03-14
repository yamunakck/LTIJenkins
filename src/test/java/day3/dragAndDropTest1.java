package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\saranya.a.shanmugam\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]/a"));
		WebElement target=driver.findElement(By.id("amt7"));
		
		//act.dragAndDrop(src,target).build().perform();
		act.clickAndHold(src).release(target).build().perform();
		
		
	}

}
