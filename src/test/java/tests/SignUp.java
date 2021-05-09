package tests;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.ElementAttributeType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignUp {
  @Test
  public void userSignUp() {

	  WebDriver driver = DriverFactory.getDriver();
	  BrowserActions.navigateToURL(driver, "https://www.phptravels.net/home");
	  
	  ElementActions.click(driver, By.xpath("//a[normalize-space()='My Account']"));
	  ElementActions.click(driver, By.xpath("//a[normalize-space()='Sign Up']"));
	
	  ElementActions.type(driver, By.name("firstname"), "test"); 
	  ElementActions.type(driver, By.name("lastname"), "test11");
	  ElementActions.type(driver, By.name("phone"), "12344"); 
	  ElementActions.type(driver, By.name("email"), "test9009@test.de");
	  ElementActions.type(driver, By.name("password"), "test11344"); 
	  ElementActions.type(driver, By.name("confirmpassword"), "test11344"); 
	  ElementActions.click(driver, By.xpath("//button[normalize-space()='Sign Up']"));
			  
	  Assertions.assertEquals("Hi, test test11", ElementActions.getText(driver, By.xpath("//h3[contains(.,'Hi, ')]")));
	  //besser assertElementAttribute zu benutzen, da bei Screenshot in Allure sehr gut darstellbar ist.
	  Assertions.assertElementAttribute(driver, By.xpath("//h3[contains(.,'Hi, ')]"), ElementAttributeType.TEXT, "Hi, test test11");

}}
