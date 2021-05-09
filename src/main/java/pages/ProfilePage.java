package pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

	private WebDriver driver;
	
	//Constructor
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Element Locators
	private By  hiMessage_text  = By.xpath("//h3[contains(.,'Hi, ')]");
	
	
	
	//Actions
	public  String getHimessageText () {
		return ElementActions.getText(driver, hiMessage_text);
		
	}
	public  By getHimessageTextLocator() {
		return hiMessage_text;
		
	
	}
}
