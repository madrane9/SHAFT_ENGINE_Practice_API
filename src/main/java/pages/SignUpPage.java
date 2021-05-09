package pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

	private WebDriver driver;
	
	//Constructor
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Element Locators
	private By firstname_textFiled = By.name("firstname");
	private By lastname_textFiled = By.name("lastname");
	private By phone_textFiled = By.name("phone");
	private By email_textFiled = By.name("email");
	private By password_textFiled = By.name("password");
	private By confirmPassword_textFiled = By.name("confirmpassword");
	private By signUpButton = By.xpath("//button[normalize-space()='Sign Up']");
	
	
	
	//Actions
public void userSignUp(String firstName, String lastName, String phone, String email, String password) {
	new ElementActions(driver)
	.type( firstname_textFiled, firstName)
	  .type( lastname_textFiled, lastName)
	  .type(phone_textFiled, phone)
	  .type( email_textFiled, email)
	  .type( password_textFiled, password) 
	  .type(confirmPassword_textFiled, password)
	  .click( signUpButton);
	
}
}
