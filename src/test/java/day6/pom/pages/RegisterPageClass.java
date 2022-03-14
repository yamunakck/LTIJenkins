package day6.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageClass {
	
	WebDriver driver;
	
	public RegisterPageClass(WebDriver driver){
		this.driver=driver;
	}
	//locators
	By male=By.id("gender-male");
	By female=By.id("gender-female");
	By fn=By.name("FirstName");
	By ln=By.name("LastName");
	By email=By.name("Email");
	By psd=By.name("Password");
	By cpsd=By.name("ConfirmPassword");
	By registerbutton=By.id("register-button");
	
	//Register function
	public void perform_register_female(String f,String l,String e, String p, String cp){
		driver.findElement(female).click();
		driver.findElement(fn).sendKeys(f);
		driver.findElement(ln).sendKeys(l);
		driver.findElement(email).sendKeys(e);
		driver.findElement(psd).sendKeys(p);
		driver.findElement(cpsd).sendKeys(cp);
		driver.findElement(registerbutton).click();
		
	}

}
