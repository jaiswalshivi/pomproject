package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//launching browser
		driver.get("https://www.saucedemo.com/v1/");
		//craeting object of POMwithoutpagefactory
		
		POMwithoutpagefactory ob=new POMwithoutpagefactory(driver);
		
		ob.enterusername("standard_user");
		ob.enterpass("secret_sauce");
		ob.loginbutton();
	}

}
