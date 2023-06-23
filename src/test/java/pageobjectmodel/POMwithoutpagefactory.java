package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMwithoutpagefactory {
	
	WebDriver driver;

	//creating a constructor
	POMwithoutpagefactory(WebDriver d){
		driver=d;
		
	}
	
	By username=By.id("user-name");
	By password=By.id("password");
    By loginbutton=By.id("login-button");
    
    public void enterusername(String uname) {
    	
    	driver.findElement(username).sendKeys(uname);
    }

    
 public void enterpass(String pass) {
    	
    	driver.findElement(password).sendKeys(pass);
    }
 
 public void loginbutton() {
 	
 	driver.findElement(loginbutton).click();
 }
 
 
}
