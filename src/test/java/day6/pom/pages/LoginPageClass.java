package day6.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageClass {
	
	WebDriver driver;
	
	public LoginPageClass(WebDriver driver){
		this.driver=driver;
	}

	//locators
	@FindBy(name="Email") public WebElement email;
	@FindBy(name="Password") public WebElement psd;
	@FindBy(xpath="//input[@value='Log in']") public WebElement loginbutton;
	
	//Function
	
	public void perform_login(String un, String p){
		email.sendKeys(un);
		psd.sendKeys(p);
		loginbutton.click();
	}
	
}
