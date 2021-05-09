package tests;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.ElementAttributeType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProfilePage;
import pages.SignUpPage;

public class SignUp_POM {
	private WebDriver driver;
	private HomePage homePage;
	private SignUpPage signUpPage;
	private ProfilePage profilPage;
	
	
	@BeforeClass
	public void BeforeClass() {
		driver = DriverFactory.getDriver();
		BrowserActions.navigateToURL(driver, "https://www.phptravels.net/home");
		
		
		
	   homePage  = new HomePage(driver);
	   signUpPage = new SignUpPage(driver);
	   profilPage = new ProfilePage(driver);
	
	}
	
  @Test
  public void signUp() {
	  homePage.navigateToSignUpPage();
	  signUpPage.userSignUp("test", "test11", "12344", "test11123@test.de", "test11344");
	  
	  Assertions.assertEquals("Hi, test test11", profilPage.getHimessageText());
	  //besser assertElementAttribute zu benutzen, da bei Screenshot in Allure sehr gut darstellbar ist.
	  Assertions.assertElementAttribute(driver, profilPage.getHimessageTextLocator(), ElementAttributeType.TEXT, "Hi, test test11");
	 
  }
}
