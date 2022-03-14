package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\saranya.a.shanmugam\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println("title is :"+title);
		//check title of web page s equals to Demo Web Shop
		if(title.equals("Demo Web Shop")){
			System.out.println("title is corect");
		}
		
		//fetch current url
		System.out.println(driver.getCurrentUrl());
		
		//fetch html source of page
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
