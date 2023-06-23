package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginwithoutpageobjectmodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Webdriver
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  
  driver.get("https://www.saucedemo.com/v1/");
  driver.findElement(By.id("user-name")).sendKeys("standard_user");
  driver.findElement(By.id("password")).sendKeys("secret_sauce");
  driver.findElement(By.id("login-button")).click();
  
	}

}
