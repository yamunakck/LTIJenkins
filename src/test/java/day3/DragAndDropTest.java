package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\saranya.a.shanmugam\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.findElement(By.linkText("Droppable"));
		//for mouse and keyboard actions
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions act=new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")),
		driver.findElement(By.id("droppable"))).build().perform();
		driver.close();

	}

}
