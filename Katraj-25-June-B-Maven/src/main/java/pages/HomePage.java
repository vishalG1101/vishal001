package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement profile;
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']//child::a[text()='Logout']")
	private WebElement logout;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

   public void clickOnProfile() {
		
		profile.click();
	}
	
	public void clickOnLogout() {
		
		logout.click();
	}
	
	
}
