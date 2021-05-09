package pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Element Locators
	private By myAccount_button =  By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	private By signUp_button = By.xpath("//a[contains(.,'Sign Up') and contains(@class,'dropdown')]");
	
	
	//Actions
	public void navigateToSignUpPage () {
		ElementActions.click(driver, myAccount_button);
		ElementActions.click(driver, signUp_button);
		
	}
}
